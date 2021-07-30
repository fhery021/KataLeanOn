public class Game {

    private Track track = new Track();


    public String startUp() {
        System.out.println("Game Board Creation..." + "\n");
        track = new Track();
        System.out.println(track.getGameBoard());
        System.out.println("Board Created." + "\n");
        System.out.println("The game will start with player X.");
        return track.getGameBoard();
    }
}
