import java.util.concurrent.ThreadLocalRandom;

public class Track {

    private static final int SIZE = 3;

    private int[][] content = new int[SIZE][SIZE];

    private boolean vertical = false;
    private boolean horizontal = false;
    private boolean diagonal = false;

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

    public int checkWinner() {
        if (isDraw()) {
            return 0;
        }
        int verticalWinner = verticalLine();
        if (verticalWinner != 0) {
            this.vertical = true;
            return verticalWinner;
        }
        int horizontalWinner = horizontalLine();
        if (horizontalWinner != 0) {
            this.horizontal = true;
            return horizontalWinner;
        }

        if (checkDiagonal(1)) {
            this.diagonal = true;
            return 1;
        }

        if (checkDiagonal(2)) {
            this.diagonal = true;
            return 2;
        }

        return -1;
    }

    private boolean checkDiagonal(int player) {
        return (diagonalLine1ForPlayer(player) || diagonalLine2ForPlayer(player));
    }

    private int verticalLine() {
        for (int col = 0; col < content.length; col++) {
            if ((content[0][col] != 0) && (content[0][col] == content[1][col] && content[0][col] == content[2][col])) {
                return content[0][col];
            }

        }
        return 0;
    }

    private int horizontalLine() {
        for (int[] ints : content) {
            if ((ints[0] != 0) && (ints[0] == ints[1] && ints[1] == ints[2])) {
                return ints[0];
            }
        }
        return 0;
    }

    private boolean diagonalLine1ForPlayer(int player) {
        for (int row = 0; row < content.length; row++) {
            for (int col = 0; col < content.length; col++) {
                if (row == col && (content[row][col] != player)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean diagonalLine2ForPlayer(int player) {
        for (int row = 0; row < content.length; row++) {
            for (int col = 0; col < content.length; col++) {
                if (((row + col) == (SIZE - 1)) && (content[row][col] != player)) {
                    return false;
                }
            }
        }
        return true;
    }


    private boolean isDraw() {
        boolean trackIsFull = true;
        for (int[] ints : content) {
            for (int col = 0; col < content.length; col++) {
                if (ints[col] == 0) {
                    trackIsFull = false;
                    break;
                }
            }
        }
        return trackIsFull;

    }

    boolean isHorizontal() {
        return horizontal;
    }

    boolean isVertical() {
        return vertical;
    }

    boolean isDiagonal() {
        return diagonal;
    }
}
