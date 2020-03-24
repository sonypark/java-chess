package chess.domain.piece;

import chess.domain.Position;

public class Queen extends AbstractPiece {
    public Queen(Position position, Team team) {
        super(position, Symbol.QUEEN, team);
    }

    @Override
    public void move(Position position) {
        this.position = position;
    }
}
