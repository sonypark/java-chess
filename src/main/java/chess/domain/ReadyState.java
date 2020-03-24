package chess.domain;

import chess.domain.piece.Team;

public class ReadyState implements State {
    @Override
    public State command(String input) {
        if (input.equals("start")) {
            return new RunningState(new Board(), new Turn(Team.WHITE));
        }
        if (input.equals("end")) {
            return new EndState();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Board getBoard() {
        return new Board();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
