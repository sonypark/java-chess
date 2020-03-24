package chess.domain.piece;

import chess.domain.Position;

public class Queen extends AbstractPiece {
    public Queen(Position position) {
        super(position, Symbol.QUEEN);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
