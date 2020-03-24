package chess.domain.piece;

import chess.domain.Position;

public class Knight extends AbstractPiece {
    public Knight(Position position) {
        super(position, Symbol.KNIGHT);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
