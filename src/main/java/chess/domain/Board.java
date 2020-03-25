package chess.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

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
