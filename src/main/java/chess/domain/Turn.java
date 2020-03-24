package chess.domain;

import chess.domain.piece.Team;

public class Turn {
    private final Team team;

    public Turn(Team team) {
        this.team = team;
    }

    public Turn next() {
        if (team.isBlack()) {
            return new Turn(Team.WHITE);
        }
        return new Turn(Team.BLACK);
    }
}
