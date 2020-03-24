package chess.domain.piece;

import chess.domain.Position;

public class Blank extends AbstractPiece {
    public Blank(Position position) {
        super(position, Symbol.BLANK, Team.NONE);
    }

    @Override
    public void move(Position position) {
        throw new UnsupportedOperationException();
    }
}
