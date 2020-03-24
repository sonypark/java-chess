package chess.domain.piece;

import chess.domain.Position;

public class Blank extends AbstractPiece {
    public Blank(Position position) {
        super(position, Symbol.BLANK);
    }

    @Override
    public void move(Position position) {
        throw new UnsupportedOperationException();
    }
}
