package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReadyStateTest {

    @Test
    @DisplayName("start명령어 입력시 RunningState 리턴")
    void command_start() {
        assertThat(new ReadyState().command("start")).isInstanceOf(RunningState.class);
    }

    @Test
    @DisplayName("end명령어 입력시 EndState 리턴")
    void command_end() {
        assertThat(new ReadyState().command("end")).isInstanceOf(EndState.class);
    }

    @Test
    @DisplayName("start,end 이외 명령어 입력시 예외 발생")
    void command_invalid() {
        assertThatExceptionOfType(UnsupportedOperationException.class)
            .isThrownBy(() -> new ReadyState().command("move"));
    }

    @Test
    @DisplayName("ReadyState에서 isFinished는 항상 false")
    void isFinished() {
        assertThat(new ReadyState().isFinished()).isFalse();
    }
}
