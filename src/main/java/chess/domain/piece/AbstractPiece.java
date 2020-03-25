package chess.domain.piece;

public abstract class AbstractPiece implements Piece {
    protected Position position;
    protected Symbol symbol;
    protected Team team;

    AbstractPiece(Position position, Symbol symbol, Team team) {
        this.position = position;
        this.symbol = symbol;
        this.team = team;
    }

    public Position getPosition() {
        return this.position;
    }

    public String symbol() {
        if (this.team.isBlack()) {
            return symbol.getBlack();
        }
        return symbol.getWhite();
    }

    public boolean isNotTeam(Team team) {
        return !this.team.equals(team);
    }

    protected abstract boolean isMovable(Position target);
}
