package chess.domain.piece;

import chess.domain.Position;

public class Pawn extends AbstractPiece {
    public Pawn(Position position, Team team) {
        super(position, Symbol.PAWN, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }

}
