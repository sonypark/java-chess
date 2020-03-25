package chess.domain.piece;

import chess.domain.piece.exception.NotMovableException;

public class Bishop extends AbstractPiece {
    public Bishop(Position position, Team team) {
        super(position, Symbol.BISHOP, team);
    }

    @Override
    public void move(Position target) {
        if (isMovable(target)) {
            this.position = target;
            return;
        }
        throw new NotMovableException();
    }

    @Override
    protected boolean isMovable(Position target) {
        Position vector = position.vector(target);
        return Direction.diagonalDirections().contains(Direction.of(vector.getX(), vector.getY()));
    }

}
