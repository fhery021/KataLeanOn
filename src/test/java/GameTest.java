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
    void game_shouldDrawTrack() {
        assertThat(game.drawGameBoard()).isEqualTo(TestHelper.EMPTY_TRACK);
    }

    @Test
    void startNewGame_shouldReturnEmptyGameBoard() {
        String expectedOutputOnStart = "Game Board Creation..." + "\n" +
                                       TestHelper.EMPTY_TRACK +
                                       "Board Created." + "\n" +
                                       "The game will start with player X.";
        String output = game.startGame();

        assertThat(output).isEqualTo(expectedOutputOnStart);

    }

}
