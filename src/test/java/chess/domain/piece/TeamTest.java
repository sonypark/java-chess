package chess.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TeamTest {

    @Test
    @DisplayName("Black팀인지 확인")
    void isBlack() {
        assertThat(Team.BLACK.isBlack()).isTrue();
    }

    @Test
    @DisplayName("White팀인지 확인")
    void isWhite() {
        assertThat(Team.WHITE.isWhite()).isTrue();
    }
}
