package chess.domain;

import chess.domain.piece.AbstractPiece;
import chess.domain.piece.Bishop;
import chess.domain.piece.King;
import chess.domain.piece.Knight;
import chess.domain.piece.Pawn;
import chess.domain.piece.Position;
import chess.domain.piece.Queen;
import chess.domain.piece.Rook;
import chess.domain.piece.Team;

public class PieceFactory {
    private PieceFactory() {
    }

    public static AbstractPiece create(String pieceType, Position position, Team team) {
        if (pieceType.equals("k")) {
            return new King(position, team);
        }
        if (pieceType.equals("q")) {
            return new Queen(position, team);
        }
        if (pieceType.equals("b")) {
            return new Bishop(position, team);
        }
        if (pieceType.equals("n")) {
            return new Knight(position, team);
        }
        if (pieceType.equals("r")) {
            return new Rook(position, team);
        }
        return new Pawn(position, team);
    }
}
