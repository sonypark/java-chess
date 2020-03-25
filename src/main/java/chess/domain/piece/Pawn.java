package chess.domain.piece;

import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(Position position, Team team) {
        super(position, Symbol.PAWN, team);
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
