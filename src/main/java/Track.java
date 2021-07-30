import java.util.concurrent.ThreadLocalRandom;

public class Track {

    private static final int SIZE = 3;

    private int[][] content = new int[SIZE][SIZE];

    // 0 = empty
    // 1 = X
    // 2 = O

    public Track() {
        for (int row = 0; row < content.length; row++) {
            for (int col = 0; col < content.length; col++) {
                content[row][col] = 0;
            }
        }
    }

    public int[][] getTrackContent() {
        return content;
    }

    public String getGameBoard() {
        return " | | " + "\n" + "-+-+-" + "\n" + " | | " + "\n" + "-+-+-" + "\n" + " | | ";
    }

    public void XMoves() {
        int randomRow = ThreadLocalRandom.current()
                                         .nextInt(0,SIZE-1);
        int randomColumn = ThreadLocalRandom.current()
                                         .nextInt(0,SIZE-1);
        content[randomRow][randomColumn] = 1;
    }
}
