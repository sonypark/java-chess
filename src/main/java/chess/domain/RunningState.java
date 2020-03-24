package chess.domain;

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
        if (input.equals("end")) {
            return new EndState();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
