import java.util.concurrent.TimeUnit;

public class Game {

    private static final String xMovesMessage = "Player X";
    private static final String oMovesMessage = "Player O";
    private static final String playerXWonMessage = "PLAYER X WON";
    private static final String playerOWonMessage = "PLAYER O WON";
    private static final String gameEndsWithDrawMessage = "GAME ENDS WITH DRAW";

    private Track track = new Track();


    public String startUp() {
        System.out.println("Game Board Creation..." + "\n");
        track = new Track();
        System.out.println(track.getGameBoard());
        System.out.println("Board Created." + "\n");
        System.out.println("The game will start with player X.");
        return track.getGameBoard();
    }


    public String play() throws InterruptedException {
        startUp();
        waitTwoSeconds();
        track.XMoves();
        System.out.println(track.getGameBoard());
        boolean currentPlayerIsX = false;
        while (track.checkWinner() == -1) {
            if (currentPlayerIsX) {
                track.XMoves();
                System.out.println(xMovesMessage);
                currentPlayerIsX = false;
            } else {
                track.OMoves();
                System.out.println(oMovesMessage);
                currentPlayerIsX =true;
            }
            System.out.println(track.getGameBoard());
            waitTwoSeconds();
        }
        int winner = track.checkWinner();

        if (winner == 0) {
            System.out.println(gameEndsWithDrawMessage);
            return gameEndsWithDrawMessage;
        }

        if (winner == 1) {
            System.out.println(playerXWonMessage);
            return playerXWonMessage;
        }

        if (winner == 2) {
            System.out.println(playerOWonMessage);
            return playerOWonMessage;
        }

        return "";
    }


    private void waitTwoSeconds() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}
