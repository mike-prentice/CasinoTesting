package Java.src;

import java.util.*;
import java.util.Scanner;

import static Java.src.Dice.roll;

public class CasinoTesting {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> diceRoll = new ArrayList<>();
    HashMap<String, Integer> hand = new HashMap<>();
    String klondikeHand = "";
    int handRank;
    int houseRank;
    int p2handRank;
    String WinMsg = "";

    public void klondikeGame() {
        System.out.println("Press any key to roll the dice...\n");
        String roll = scanner.next();
        if (roll != null) {
            getroll();
        }
        evaluateHand(diceRoll);
        getKlondikeHand(hand);
        p2handRank = handRank;
        System.out.println("You have " + p2handRank + " !\n");
        diceRoll.clear();
        hand.clear();


        getroll();
        evaluateHand(diceRoll);
        getKlondikeHand(hand);
        houseRank = handRank;
        System.out.println("The house has " + houseRank + " !\n");
        diceRoll.clear();
        hand.clear();


        getWinner();
        System.out.println(WinMsg);
        System.out.println("\n");
        System.out.println("Play again? Y or N ? \n");
        String choice = scanner.next().toUpperCase();
        if (choice.equals("Y")) {
            houseRank = 0;
            p2handRank = 0;
            klondikeGame();
        } else {
            isOver();
        }
    }

    public ArrayList<Integer> getroll() {
        roll(5);
        return diceRoll;
    }


    public HashMap<String, Integer> evaluateHand(ArrayList<Integer> diceRoll) {
        hand.put("ones", Collections.frequency(diceRoll, 1));
        hand.put("twos", Collections.frequency(diceRoll, 2));
        hand.put("threes", Collections.frequency(diceRoll, 3));
        hand.put("fours", Collections.frequency(diceRoll, 4));
        hand.put("fives", Collections.frequency(diceRoll, 5));
        hand.put("sixes", Collections.frequency(diceRoll, 6));


        return hand;
    }

    public int getKlondikeHand(Map<String, Integer> hand) {

        if (hand.containsValue(5)) {
            klondikeHand = "Five of a Kind";
            handRank = 6;
            return handRank;
        } else if (hand.containsValue(4)) {
            klondikeHand = "Four of a Kind";
            handRank = 5;
            return handRank;
        } else if (hand.containsValue(3) && hand.containsValue(2)) {
            klondikeHand = " a Full House";
            handRank = 4;
            return handRank;
        } else if (hand.containsValue(3)) {
            klondikeHand = "Three of a Kind";
            handRank = 3;
            return handRank;
        } else if (hand.containsValue(2)) {
            if (isTwoPair(diceRoll)) {
                klondikeHand = "Two Pair";
                handRank = 2;
            } else {
                klondikeHand = " a Pair";
                handRank = 1;
                return handRank;
            }
        } else {
            klondikeHand = "Tied, the house wins...";
            handRank = 7;
        }
        return handRank;
    }


    public boolean isTwoPair(ArrayList<Integer> hand) {
        HashSet<Integer> newHash = new HashSet<>(hand);
        return newHash.size() == 3;
    }

    public String getWinner() {
        if (handRank > p2handRank) {
            WinMsg = "HOUSE WINS!!!!";
            return WinMsg;
        } else if (p2handRank > handRank) {
            WinMsg = "YOU WIN!!!";
            return WinMsg;
        } else {
            WinMsg = "TIE, THE HOUSE WINS!!!!";
            return WinMsg;
        }
    }


    public Boolean isOver() {
        return true;
    }


    public void run() {
        klondikeGame();
    }

}
