public class TestHelper {
    public static final String EMPTY_TRACK = " | | " + "\n" + //
                                             "-+-+-" + "\n" +//
                                             " | | " + "\n" +//
                                             "-+-+-" + "\n" +//
                                             " | | " + "\n";//


    public static int[][] GET_O_WINNER_HORIZONTAL_CONTENT() {
        return new int[][] {
                {
                        1, 0, 1
                }, {
                        2, 2, 2
                }, {
                        1, 0, 0
                }
        };
    }

    public static int[][] GET_X_WINNER_DIAGONAL_CONTENT() {
        return new int[][] {
                {
                        1, 0, 0
                }, {
                        2, 1, 0
                }, {
                        2, 0, 1
                }
        };
    }

    public static int[][] GET_DRAW_CONTENT() {
        return new int[][] {
                {
                        1, 2, 1
                }, {
                        2, 1, 2
                }, {
                        2, 1, 1
                }
        };
    }

    public static int[][] GET_NO_WINNER_CONTENT() {
        return new int[][] {
                {
                        1, 0, 1
                }, {
                        2, 0, 2
                }, {
                        2, 0, 1
                }
        };
    }
}
