package chess.domain.piece;

import java.util.List;

public class Queen extends AbstractPiece {
    public Queen(Position position, Team team) {
        super(position, Symbol.QUEEN, team);
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
