import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrackTest {
    private Track track;

    @BeforeEach
    public void init() {
        track = new Track();
    }


    @Test
    void track_shouldBeCreated() {
        assertThat(track).isNotNull();
    }

    @Test
    void track_shouldHaveTrackContentArray() {
        int[][] contentArray = track.getTrackContent();
        assertThat(contentArray).isNotNull();
    }

    @Test
    void track_shouldHaveGameBoard() {
        String gameBoard = track.getGameBoard();
        assertThat(gameBoard).isNotNull();
    }

    @Test
    void emptyGameBoard_shouldLookLikeInRequirements() {
        String gameBoard = track.getGameBoard();
        assertThat(gameBoard).isEqualTo(TestHelper.EMPTY_TRACK);
    }

    @Test
    void track_X_moves() {
        int[][] trackContent = track.getTrackContent();
        track.XMoves();
        boolean containsX = false;
        for (int i = 0; i < trackContent.length; i++) {
            for (int j = 0; j < trackContent.length; j++) {
                if (trackContent[i][j] == 1) {
                    containsX = true;
                }
            }
        }
        assertTrue(containsX);
    }

    @Test
    void track_O_moves() {
        int[][] trackContent = track.getTrackContent();
        track.OMoves();
        boolean containsO = false;
        for (int i = 0; i < trackContent.length; i++) {
            for (int j = 0; j < trackContent.length; j++) {
                if (trackContent[i][j] == 2) {
                    containsO = true;
                }
            }
        }
        assertTrue(containsO);
    }

    @Test
    void O_moves_shouldDrawAndContainO() {
        track.OMoves();
        assertTrue(track.getGameBoard().contains("O"));
    }
}
