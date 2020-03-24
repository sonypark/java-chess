package chess.domain.piece;

import chess.domain.Position;

public class Bishop  extends AbstractPiece{
    public Bishop(Position position) {
        super(position, Symbol.BISHOP);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
