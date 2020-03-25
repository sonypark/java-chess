package chess.domain.piece;

import static java.lang.Math.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Position {
    private static final int ROW = 8;
    private static final int COL = 8;
    private static final Map<String, Position> POSITIONS = new HashMap<>();

    private final int x;
    private final int y;

    static {
        for (int y = 0; y < ROW; y++) {
            for (int x = 0; x < COL; x++) {
                POSITIONS.put(key(x, y), new Position(x, y));
            }
        }
    }

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Position of(int x, int y) {
        return from(key(x, y));
    }

    public static Position from(String key) {
        Position position = POSITIONS.get(key.toLowerCase());
        if (position == null) {
            throw new IllegalArgumentException("체스판 범위에 벗어난 위치 값입니다.");
        }
        return position;
    }

    public static String key(int x, int y) {
        return (char)('a' + x) + String.valueOf(1 + y);
    }

    public Position subtract(Position position) {
        return new Position(this.x - position.x, this.y - position.y);
    }

    public Position vector(Position position) {
        Position difference = subtract(position);
        double distance = sqrt(pow(abs(difference.x), 2) + pow(abs(difference.y), 2));
        return new Position((int)ceil(abs(difference.x) / distance), (int)ceil(abs(difference.y) / distance));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position)o;
        return x == position.x &&
            y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
