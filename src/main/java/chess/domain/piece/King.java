package chess.domain.piece;

import chess.domain.Position;

public class King extends AbstractPiece {
    public King(Position position, Team team) {
        super(position, Symbol.KING, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
