package chess.domain.piece;

import java.util.List;

public class Knight extends AbstractPiece {
    public Knight(Position position, Team team) {
        super(position, Symbol.KNIGHT, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }

    @Override
    protected boolean isMovable(Position target) {
        return false;
    }
}
