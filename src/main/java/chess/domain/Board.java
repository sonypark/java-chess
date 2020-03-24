package chess.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
	private List<Rank> ranks;

	public Board() {
		this.ranks = new ArrayList<>();
	}

	public void initialize() {
		ranks.add(Rank.initializePieces(8));
		ranks.add(Rank.initializePawn(7));
		ranks.add(Rank.initializeBlanks(6));
		ranks.add(Rank.initializeBlanks(5));
		ranks.add(Rank.initializeBlanks(4));
		ranks.add(Rank.initializeBlanks(3));
		ranks.add(Rank.initializePawn(2));
		ranks.add(Rank.initializePieces(1));
	}

	public List<Rank> getRanks() {
		return Collections.unmodifiableList(ranks);
	}
}
