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


    public String play() {
        return playerXWonMessage;
    }
}
