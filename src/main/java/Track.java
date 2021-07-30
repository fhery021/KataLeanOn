import java.util.concurrent.ThreadLocalRandom;

public class Track {

    private static final int SIZE = 3;

    private int[][] content = new int[SIZE][SIZE];

    public Track() {
        for (int row = 0; row < content.length; row++) {
            for (int col = 0; col < content.length; col++) {
                content[row][col] = 0;
            }
        }
    }

    public Track(int[][] content) {
        this.content = content;
    }

    public int[][] getTrackContent() {
        return content;
    }

    public String getGameBoard() {
        return xOrO(content[0][0]) + "|" + xOrO(content[0][1]) + "|" + xOrO(content[0][2]) + "\n" + //
               "-+-+-" + "\n" +//
               xOrO(content[1][0]) + "|" + xOrO(content[1][1]) + "|" + xOrO(content[1][2]) + "\n" + //
               "-+-+-" + "\n" +//
               xOrO(content[2][0]) + "|" + xOrO(content[2][1]) + "|" + xOrO(content[2][2]) + "\n";
    }

    private String xOrO(int content) {
        switch (content) {
            case 1:
                return "X";
            case 2:
                return "O";
            default:
                return " ";
        }
    }

    public void XMoves() {
        int randomRow = ThreadLocalRandom.current()
                                         .nextInt(0, SIZE - 1);
        int randomColumn = ThreadLocalRandom.current()
                                            .nextInt(0, SIZE - 1);
        content[randomRow][randomColumn] = 1;
    }

    public void OMoves() {
        int randomRow = ThreadLocalRandom.current()
                                         .nextInt(0, SIZE - 1);
        int randomColumn = ThreadLocalRandom.current()
                                            .nextInt(0, SIZE - 1);
        content[randomRow][randomColumn] = 2;
    }
}
