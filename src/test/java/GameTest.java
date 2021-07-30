import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    Game game = new Game();

    @Test
    void game_shouldBeCreated() {
        assertThat(game).isNotNull();
    }

    @Test
    void game_shouldDrawTrack() {
        assertThat(game.drawGameBoard()).isEqualTo(TestHelper.EMPTY_TRACK);
    }
}
