package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import chess.domain.piece.Blank;
import chess.domain.piece.Pawn;
import chess.domain.piece.Piece;
import chess.domain.piece.Team;

public class BoardTest {
	@Test
	@DisplayName("원하는 위치로 말 이동")
	void move() {
		Board board = new Board();
		board.initialize();
		Position source = Position.from("b2");
		Position target = Position.from("b3");
		board.move(source, target, Team.WHITE);
		Piece sourcePiece = board.getRanks().get(source.getY()).get(source.getX());
		Piece targetPiece = board.getRanks().get(target.getY()).get(target.getX());
		assertThat(sourcePiece).isInstanceOf(Blank.class);
		assertThat(targetPiece).isInstanceOf(Pawn.class);
	}

	@Test
	@DisplayName("상대방의 말을 움직인 경우")
	void move_opponent_piece() {
		Board board = new Board();
		board.initialize();
		Position source = Position.from("a7");
		Position target = Position.from("a6");
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
				() -> board.move(source, target, Team.WHITE));
	}
}
