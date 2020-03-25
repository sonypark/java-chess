package chess.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import chess.domain.piece.AbstractPiece;
import chess.domain.piece.Blank;
import chess.domain.piece.Pawn;
import chess.domain.piece.Piece;
import chess.domain.piece.Team;

public class Rank {
	private List<AbstractPiece> pieces;

	private Rank(List<AbstractPiece> pieces) {
		this.pieces = pieces;
	}

	public static Rank initializePieces(int y, Team team) {
		List<String> pieceNames = Arrays.asList("r", "n", "b", "q", "k", "b", "n", "r");
		List<AbstractPiece> pieces = new ArrayList<>();
		for (int x = 0; x < 8; x++) {
			AbstractPiece piece = PieceFactory.create(pieceNames.get(x), Position.of(x, y), team);
			pieces.add(piece);
		}
		return new Rank(pieces);
	}

	public static Rank initializeBlanks(int y) {
		List<AbstractPiece> pieces = new ArrayList<>();
		for (int x = 0; x < 8; x++) {
			AbstractPiece piece = new Blank(Position.of(x, y));
			pieces.add(piece);
		}
		return new Rank(pieces);
	}

	public static Rank initializePawns(int y, Team team) {
		List<AbstractPiece> pieces = new ArrayList<>();
		for (int x = 0; x < 8; x++) {
			AbstractPiece piece = new Pawn(Position.of(x, y), team);
			pieces.add(piece);
		}
		return new Rank(pieces);
	}

	public List<AbstractPiece> getValue() {
		return Collections.unmodifiableList(pieces);
	}

	public AbstractPiece get(int x) {
		return pieces.get(x);
	}

	public void move(int x, Position target) {
		Piece piece = pieces.get(x);
		piece.move(target);
	}

	public void set(int x, AbstractPiece piece) {
		pieces.set(x, piece);
	}
}
