package chess.domain;

import chess.domain.piece.AbstractPiece;
import chess.domain.piece.Bishop;
import chess.domain.piece.King;
import chess.domain.piece.Knight;
import chess.domain.piece.Pawn;
import chess.domain.piece.Queen;
import chess.domain.piece.Rook;

public class PieceFactory {
	private PieceFactory() {}

	public static AbstractPiece create(String pieceType, Position position) {
		if (pieceType.equals("k")) {
			return new King(position);
		}
		if (pieceType.equals("q")) {
			return new Queen(position);
		}
		if (pieceType.equals("b")) {
			return new Bishop(position);
		}
		if (pieceType.equals("n")) {
			return new Knight(position);
		}
		if (pieceType.equals("r")) {
			return new Rook(position);
		}
		return new Pawn(position);
	}
}
