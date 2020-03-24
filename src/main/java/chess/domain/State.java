package chess.domain;

public interface State {

    State command(String input);

    Board getBoard();

    boolean isFinished();
}
