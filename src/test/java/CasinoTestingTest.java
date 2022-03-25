
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

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
    public boolean evaluateHand() {
        CasinoTesting game = new CasinoTesting();
        ArrayList<java.lang.Integer> roll = new ArrayList<>();
        roll.add(1);
        roll.add(1);
        roll.add(1);
        roll.add(1);
        roll.add(1);
        HashMap<String, Integer> map = game.evaluateHand(roll);
        Integer expected = map.get("ones");
        int actual = 5;
        if (expected == actual){
            return true;
        }
        return false;
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
        //given
        CasinoTesting game = new CasinoTesting();
        game.houseRank = 5;
        game.p2handRank = 4;
        String expected = "HOUSE WINS!!!!";
        //when
        String actual = game.getWinner();
        //then
        Assert.assertEquals(actual, expected);

    }


}