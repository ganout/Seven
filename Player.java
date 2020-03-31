import java.util.Random;

public class Player implements UserInterface{

    private String name;
    private int score;

    public Player(String name) {

        this.name = name;
        this.score = 0;
    }

    /**
     * 
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @return this.score
     */
    public int getScore() {
        return this.score;
    }

    /**
     * @param newScore : input the new score
     * @return this.name
     */
    public void setScore(int newSore) {
        this.score = newSore;
    }

    public int diceRoll() {
        
        Random nbRandom = new Random();
        int result = 1 + nbRandom.nextInt(6);
        return result;
    }
}