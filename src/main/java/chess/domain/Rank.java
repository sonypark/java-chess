package chess.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import chess.domain.piece.AbstractPiece;
import chess.domain.piece.Blank;
import chess.domain.piece.Pawn;
import chess.domain.piece.Piece;

public class Rank {
	private List<AbstractPiece> pieces;

	private Rank(List<AbstractPiece> pieces) {
		this.pieces = pieces;
	}

	public static Rank initializePieces(int y) {
		List<String> pieceNames = Arrays.asList("r", "n", "b", "q", "k", "b", "n", "r");
		List<AbstractPiece> pieces = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			AbstractPiece piece = PieceFactory.create(pieceNames.get(i), Position.of(i + 1, y));
			pieces.add(piece);
		}
		return new Rank(pieces);
	}

	public static Rank initializeBlanks(int y) {
		List<AbstractPiece> pieces = new ArrayList<>();
		for (int x = 1; x <= 8; x++) {
			AbstractPiece piece = new Blank(Position.of(x, y));
			pieces.add(piece);
		}
		return new Rank(pieces);
	}

	public static Rank initializePawn(int y) {
		List<AbstractPiece> pieces = new ArrayList<>();
		for (int x = 1; x <= 8; x++) {
			AbstractPiece piece = new Pawn(Position.of(x, y));
			pieces.add(piece);
		}
		return new Rank(pieces);
	}

	public List<Piece> getValue() {
		return Collections.unmodifiableList(pieces);
	}
}
