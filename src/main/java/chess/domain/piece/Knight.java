package chess.domain.piece;

import chess.domain.Position;

public class Knight extends AbstractPiece {
    public Knight(Position position, Team team) {
        super(position, Symbol.KNIGHT, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
