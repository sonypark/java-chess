package chess.domain.piece;

import chess.domain.Position;

public class Rook extends AbstractPiece {
    public Rook(Position position) {
        super(position, Symbol.ROOK);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
