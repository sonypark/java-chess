package chess.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import chess.domain.piece.AbstractPiece;
import chess.domain.piece.Blank;
import chess.domain.piece.Position;
import chess.domain.piece.Team;

public class Board {
	private List<Rank> ranks;

	public Board() {
		this.ranks = new ArrayList<>();
	}

	public void initialize() {
		ranks.add(Rank.initializePieces(0, Team.WHITE));
		ranks.add(Rank.initializePawns(1, Team.WHITE));
		ranks.add(Rank.initializeBlanks(2));
		ranks.add(Rank.initializeBlanks(3));
		ranks.add(Rank.initializeBlanks(4));
		ranks.add(Rank.initializeBlanks(5));
		ranks.add(Rank.initializePawns(6, Team.BLACK));
		ranks.add(Rank.initializePieces(7, Team.BLACK));
	}

	public void move(Position source, Position target, Team team) {
		Rank sourceRank = ranks.get(source.getY());
		Rank targetRank = ranks.get(target.getY());
		AbstractPiece piece = sourceRank.get(source.getX());
		if (piece.isNotTeam(team)) {
			throw new IllegalArgumentException();
		}
		piece.move(target);
		sourceRank.set(source.getX(), new Blank(source));
		targetRank.set(target.getX(), piece);
	}

	public List<Rank> getRanks() {
		return Collections.unmodifiableList(ranks);
	}

	public List<Rank> getReverseRanks() {
		List<Rank> reverseRanks = new ArrayList<>();
		ListIterator<Rank> iterator = ranks.listIterator(ranks.size());
		while (iterator.hasPrevious()) {
			reverseRanks.add(iterator.previous());
		}
		return reverseRanks;
	}
}
