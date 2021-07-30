import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(game.startGame()).isEqualTo(TestHelper.EMPTY_TRACK);
    }

}
