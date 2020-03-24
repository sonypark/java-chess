package chess.domain.piece;

import chess.domain.Position;

public abstract class AbstractPiece implements Piece {
    protected Position position;
    protected Symbol symbol;

    AbstractPiece(Position position, Symbol symbol) {
        this.position = position;
        this.symbol = symbol;
    }

    public Position getPosition() {
        return this.position;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
