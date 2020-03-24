package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import chess.domain.piece.Team;

class RunningStateTest {

    @Test
    @DisplayName("end 명령어 입력시 EndState 리턴")
    void command_end() {
        assertThat(new RunningState(new Board(), new Turn(Team.WHITE)).command("end")).isInstanceOf(EndState.class);
    }

    @Test
    @DisplayName("end 이외 명령어 입력시 예외 발생")
    void command_invalid() {
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(
            () -> new RunningState(new Board(), new Turn(Team.WHITE)).command("start"));
    }

    @Test
    @DisplayName("RunningState에서 isFinished는 항상 false")
    void isFinished() {
        assertThat(new RunningState(new Board(), new Turn(Team.WHITE)).isFinished()).isFalse();
    }
}
