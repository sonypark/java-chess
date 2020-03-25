package chess.domain.piece;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import chess.domain.piece.exception.NotMovableException;

class BishopTest {

    @Test
    @DisplayName("Bishop이 이동할 수 없는 위치로 이동시 예외 발생")
    void move() {
        Bishop bishop = new Bishop(Position.from("c1"), Team.WHITE);
        Position target = Position.from("d1");
        assertThatExceptionOfType(NotMovableException.class).isThrownBy(() -> bishop.move(target));
    }

    @Test
    @DisplayName("Bishop이 이동할 수 있는 위치인 경우 True 리턴")
    void isMovable() {
        Bishop bishop = new Bishop(Position.from("c1"), Team.WHITE);
        Position target = Position.from("d2");
        assertThat(bishop.isMovable(target)).isTrue();
    }
}
