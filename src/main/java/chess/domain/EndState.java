package chess.domain;

public class EndState implements State {
    @Override
    public State command(String input) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Board getBoard() {
        return new Board();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
