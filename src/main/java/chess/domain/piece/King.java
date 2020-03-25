package chess.domain.piece;

public class King extends AbstractPiece {
    public King(Position position, Team team) {
        super(position, Symbol.KING, team);
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
