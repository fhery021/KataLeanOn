import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;
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
        for (int[] ints : trackContent) {
            for (int j = 0; j < trackContent.length; j++) {
                if (ints[j] == 1) {
                    containsX = true;
                    break;
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
        for (int[] ints : trackContent) {
            for (int j = 0; j < trackContent.length; j++) {
                if (ints[j] == 2) {
                    containsO = true;
                    break;
                }
            }
        }
        assertTrue(containsO);
    }

    @Test
    void O_moves_shouldDrawAndContainO() {
        track.OMoves();
        assertTrue(track.getGameBoard()
                        .contains("O"));
    }

    @Test
    void X_moves_shouldDrawAndContainX() {
        track.XMoves();
        assertTrue(track.getGameBoard()
                        .contains("X"));
    }

    @Test
    void track_shouldCheckWinnerX() {
        track = new Track(fillContentXIsWinner());
        assertThat(track.checkWinner()).isEqualTo(1);

    }


    @Test
    void track_shouldCheckWinnerO() {
        track = new Track(fillContentOIsWinner());
        assertThat(track.checkWinner()).isEqualTo(2);

    }

    private int[][] fillContentOIsWinner() {
        int[][] content = {
                {
                        1, 0, 1
                }, {
                        2, 2, 2
                }, {
                        1, 0, 0
                }
        };
        return content;
    }

    private int[][] fillContentXIsWinner() {
        int[][] content = {
                {
                        1, 0, 0
                }, {
                        2, 1, 0
                }, {
                        2, 0, 1
                }
        };
        return content;
    }
}
