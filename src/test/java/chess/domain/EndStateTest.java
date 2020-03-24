package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EndStateTest {

    @Test
    @DisplayName("명령어 입력시 예외 발생")
    void command() {
        assertThatExceptionOfType(UnsupportedOperationException.class)
            .isThrownBy(() -> new EndState().command("move"));
    }

    @Test
    @DisplayName("EndState에서 isFinished는 항상 true")
    void isFinished() {
        assertThat(new EndState().isFinished()).isTrue();
    }
}
