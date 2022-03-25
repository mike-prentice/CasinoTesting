package Java.src;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CasinoTestingTest {

    @Test
    void klondikeGame() {
    }

    @Test
    void getroll() {
        //given
        CasinoTesting game = new CasinoTesting();
        int expected = 5;
        //when
        ArrayList<Integer> diceRoll = game.getroll();
        int actual = diceRoll.size();
        //then
        Assert.assertEquals(expected, actual);
        diceRoll.clear();
    }

    @Test
    public HashMap<String, Integer> evaluateHand() {
        //given
        CasinoTesting game = new CasinoTesting();

        //when
        ArrayList<Integer> handEval = game.getroll();

        //then
        HashMap<String, Integer> expected = game.evaluateHand(handEval);
        handEval.clear();
    }

    @Test
    void getKlondikeHand() {
        CasinoTesting game = new CasinoTesting();
        ArrayList<Integer> roll = new ArrayList<>();
        roll.add(1);
        roll.add(1);
        roll.add(1);
        roll.add(1);
        roll.add(1);
        HashMap<String, Integer> map = game.evaluateHand(roll);
        int expected = map.get("ones");
        int actual = 5;
        Assert.assertEquals(expected, actual);
        roll.clear();
    }

    @Test
    void isTwoPair() {
        ///given
        CasinoTesting game = new CasinoTesting();
        ArrayList<Integer> newArr = new ArrayList<>();
        //when
        newArr.add(2);
        newArr.add(3);
        newArr.add(3);
        newArr.add(2);
        newArr.add(6);

        //then
        Assert.assertTrue(game.isTwoPair(newArr));
    }

    @Test
    void getWinner() {
    }

    @Test
    void isOver() {
    }

    @Test
    void run() {
    }
}