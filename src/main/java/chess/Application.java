package chess;

import chess.domain.ChessGame;
import chess.domain.ReadyState;
import chess.view.InputView;
import chess.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printGameStart();

        ChessGame chessGame = new ChessGame(new ReadyState());
        while (chessGame.isNotFinished()) {
            chessGame.command(InputView.inputCommand());
            OutputView.printBoard(chessGame.getBoard());
        }
    }
}
