import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void playNewGame_shouldReturnWinner() throws InterruptedException {
        String winnerMessage  = game.play();
        assertTrue(winnerMessage.equals("PLAYER X WON") || winnerMessage.equals("PLAYER O WON"));
    }
}
