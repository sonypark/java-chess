package chess.domain.piece;

public class Blank extends AbstractPiece {
    public Blank(Position position) {
        super(position, Symbol.BLANK, Team.NONE);
    }

    @Override
    public void move(Position position) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean isMovable(Position target) {
        throw new UnsupportedOperationException();
    }
}
