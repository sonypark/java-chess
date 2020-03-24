package chess.domain.piece;

public enum Symbol {
    KING("k"),
    QUEEN("q"),
    BISHOP("b"),
    KNIGHT("k"),
    ROOK("r"),
    PAWN("p"),
    BLANK(".");

    private final String name;

    Symbol(String name) {
        this.name = name;
    }

    public String getWhite() {
        return name;
    }

    public String getBlack() {
        return name.toUpperCase();
    }

}
