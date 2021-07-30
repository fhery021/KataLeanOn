import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTest {
    private Game game;

    @BeforeEach
    void init() {
        game = new Game();
    }

    @Test
    void game_shouldBeCreated() {
        assertThat(game).isNotNull();
    }

    @Test
    void startNewGame_shouldReturnEmptyGameBoard() {
        assertThat(game.startUp()).isEqualTo(TestHelper.EMPTY_TRACK);
    }

    @Test
    void playNewGame_shouldReturnWinner() {
        assertNotNull(game.play());
        assertNotNull(game.getWinner());
    }
}
