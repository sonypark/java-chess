package chess.domain;

public class ChessGame {
    private State state;

    public ChessGame(State state) {
        this.state = state;
    }

    public void command(String input) {
        state = state.command(input);
    }

    public boolean isNotFinished() {
        return !state.isFinished();
    }

    public Board getBoard() {
        return state.getBoard();
    }
}
