package chess.domain.piece;

import chess.domain.Position;

public class King extends AbstractPiece {
    public King(Position position) {
        super(position, Symbol.KING);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
