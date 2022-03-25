import java.util.ArrayList;

public class Dice {
    static ArrayList<Integer> diceRoll = new ArrayList<>();
    public int numDie;

    public Dice(int numDie) {
        this.numDie = numDie;
    }

    public static ArrayList<Integer> roll(int numDice) {
        for (int i = 0; i < numDice; i++) {
            diceRoll.add(i, (int) Math.floor(Math.random() * 6 + 1));
        }
        return diceRoll;
    }
}
