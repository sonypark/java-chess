package chess.domain.piece;

import chess.domain.Position;

public class Rook extends AbstractPiece {
    public Rook(Position position, Team team) {
        super(position, Symbol.ROOK, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
