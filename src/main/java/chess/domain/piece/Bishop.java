package chess.domain.piece;

import chess.domain.Position;

public class Bishop  extends AbstractPiece{
    public Bishop(Position position, Team team) {
        super(position, Symbol.BISHOP, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
