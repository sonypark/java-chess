package chess.view;

import chess.domain.Board;
import chess.domain.Rank;
import chess.domain.piece.AbstractPiece;

public class OutputView {

    public static void printGameStart() {
        System.out.println("체스 게임을 시작합니다.");
        System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요.");
    }

    public static void printBoard(Board board) {
        for (Rank rank : board.getReverseRanks()) {
            for (AbstractPiece piece : rank.getValue()) {
                System.out.print(piece.symbol());
            }
            System.out.println();
        }
    }
}
