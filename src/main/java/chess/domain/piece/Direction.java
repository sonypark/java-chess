package chess.domain.piece;

import java.util.Arrays;
import java.util.List;

public enum Direction {
    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0),
    NORTHEAST(1, 1),
    SOUTHEAST(1, -1),
    SOUTHWEST(-1, -1),
    NORTHWEST(-1, 1),

    // KNIGHT Direction
    NNE(1, 2),
    NNW(-1, 2),
    SSE(1, -2),
    SSW(-1, -2),
    EEN(2, 1),
    EES(2, -1),
    WWN(-2, 1),
    WWS(-2, -1);

    private final int x;
    private final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Direction of(int x, int y) {
        return Arrays.stream(values())
            .filter(direction -> direction.x == x && direction.y == y)
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }

    public static List<Direction> linearDirections() {
        return Arrays.asList(NORTH, EAST, SOUTH, WEST);
    }

    public static List<Direction> diagonalDirections() {
        return Arrays.asList(NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST);
    }

    public static List<Direction> everyDirections() {
        return Arrays.asList(NORTH, EAST, SOUTH, WEST, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST);
    }

    public static List<Direction> knightDirections() {
        return Arrays.asList(NNE, NNW, SSE, SSW, EEN, EES, WWN, WWS);
    }

    public static List<Direction> whitePawnDirections() {
        return Arrays.asList(NORTH, NORTHWEST, NORTHEAST);
    }

    public static List<Direction> blackPawnDirections() {
        return Arrays.asList(SOUTH, SOUTHWEST, SOUTHEAST);
    }

}
