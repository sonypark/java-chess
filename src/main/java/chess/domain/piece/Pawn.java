package chess.domain.piece;

import chess.domain.Position;

public class Pawn extends AbstractPiece {
    public Pawn(Position position) {
        super(position, Symbol.PAWN);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }

}
