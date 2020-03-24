package chess.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chess.domain.piece.Team;

public class Board {
    private List<Rank> ranks;

    public Board() {
        this.ranks = new ArrayList<>();
    }

    public void initialize() {
        ranks.add(Rank.initializePieces(8, Team.BLACK));
        ranks.add(Rank.initializePawn(7, Team.BLACK));
        ranks.add(Rank.initializeBlanks(6));
        ranks.add(Rank.initializeBlanks(5));
        ranks.add(Rank.initializeBlanks(4));
        ranks.add(Rank.initializeBlanks(3));
        ranks.add(Rank.initializePawn(2, Team.WHITE));
        ranks.add(Rank.initializePieces(1, Team.WHITE));
    }

    public List<Rank> getRanks() {
        return Collections.unmodifiableList(ranks);
    }
}
