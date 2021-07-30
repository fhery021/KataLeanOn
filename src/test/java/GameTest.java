import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    Game game = new Game();

    @Test
    void track_shouldBeCreated() {
        assertThat(game).isNotNull();
    }
}
