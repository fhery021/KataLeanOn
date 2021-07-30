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
        String emptyGameBoard = " | | "+ "\n" +
                                   "-+-+-" + "\n" +
                                   " | | " + "\n" +
                                   "-+-+-" + "\n"+
                                   " | | ";
        assertThat(game.drawGameBoard).isEqualTo(emptyGameBoard);

    }
}
