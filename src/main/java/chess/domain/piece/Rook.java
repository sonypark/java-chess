package chess.domain.piece;

public class Rook extends AbstractPiece {
    public Rook(Position position, Team team) {
        super(position, Symbol.ROOK, team);
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
