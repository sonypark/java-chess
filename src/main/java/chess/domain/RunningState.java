package chess.domain;

import chess.domain.piece.Position;

public class RunningState implements State {
    private Board board;
    private Turn turn;

    public RunningState(Board board, Turn turn) {
        this.board = board;
        this.turn = turn;
        board.initialize();
    }

    public Board getBoard() {
        return board;
    }

    @Override
    public State command(String input) {
        String[] tokens = input.split(" ");
        if (tokens[0].equals("end")) {
            return new EndState();
        }
        if (tokens[0].equals("move")) {
            move(Position.from(tokens[1]), Position.from(tokens[2]));
            return this;
        }
        throw new UnsupportedOperationException();
    }

    private void move(Position source, Position target) {
        board.move(source, target, turn.getTeam());
        turn = turn.next();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
