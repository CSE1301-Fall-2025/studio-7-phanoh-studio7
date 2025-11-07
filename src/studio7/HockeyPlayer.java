/**HockeyPlayer

A hockey player has a name and a jersey number. Most players shoot either right or left, but some can shoot either way. 
A player can be right- or left-handed, but shoot either right or left. This object should be able to react when a player completes a game, 
recording how many goals and assists the player earned in that game. 
A player has a certain number of goals and assists he or she has recorded over all games played.
Also, a player has a certain number of points, which is the sum of the goals and assists a player has earned.
A player has a certain number of games he or she has played. */

public class HockeyPlayer {

    private final String name;
    private final int jerseyNumber;
    private final String shooterHand;
    private int careerGoals;
    private int careerAssists;
    private int points;
    private int gamesPlayed;

    public HockeyPlayer(String name, int jerseyNumber, String shooterHand) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.shooterHand = shooterHand;
        this.careerGoals = 0;
        this.careerAssists = 0;
        this.points = 0;
        this.gamesPlayed = 0;
    }
    
    public void Game() {
        int goalsScored = (int) (Math.random() * 4);
        int assistsMade = (int) (Math.random() * 10);
        this.careerGoals += goalsScored;
        this.careerAssists += assistsMade;
        this.points = this.careerGoals + this.careerAssists;
        this.gamesPlayed++;
        
    }

    public String toString() {
        return "--Player Stats--\n" + 
        "Name: " + this.name + 
        "\nJersey Number: " + this.jerseyNumber + 
        "\nShooter Hand: " + this.shooterHand +
        "\nCareer Goals: " + this.careerGoals +
        "\nCareer Assists: " + this.careerAssists +
        "\nCareer Points: " + this.points +
        "\nGames Played: " + this.gamesPlayed;
    }

    public static void main(String args[]) {
        HockeyPlayer p1 = new HockeyPlayer("Bryan", 16, "Right");
        System.out.println(p1);
        p1.Game();
        System.out.println(p1);
        for (int i = 0; i < 10; i++) {
            p1.Game();
        }
        System.out.println(p1);

    }
}
