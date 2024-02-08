// MarioKartPlayer Class
class MarioKartPlayer {
    // Attributes
    private String playerName;
    private String character;
    private int speed;

    // Constructor
    public MarioKartPlayer(String playerName, String character, int startingSpeed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = startingSpeed;
    }

    // Boost method
    public void boost() {
        // Simulate boosting by increasing speed
        speed += 10;
        System.out.println(playerName + " boosted! Speed increased to " + speed);
    }

    // Display player information
    public void displayInfo() {
        System.out.println("Player: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
        System.out.println("--------------------");
    }
}

// MarioKartGame Class
public class MarioKartGame {
    public static void main(String[] args) {
        // Instantiate two MarioKartPlayer objects
        MarioKartPlayer player1 = new MarioKartPlayer("Player 1", "Mario", 50);
        MarioKartPlayer player2 = new MarioKartPlayer("Player 2", "Luigi", 45);

        // Display information of both players
        System.out.println("Initial Player Information:");
        player1.displayInfo();
        player2.displayInfo();

        // Simulate boost action for each player
        player1.boost();
        player2.boost();

        // Display updated information of both players after the boost
        System.out.println("Updated Player Information after Boost:");
        player1.displayInfo();
        player2.displayInfo();
    }
}
