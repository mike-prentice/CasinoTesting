import Java.src.CasinoTesting;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

class CasinoTestingTest {
    @Test
    void getrollTest() {
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
    public void getPlayerRollTest() {
        CasinoTesting game = new CasinoTesting();
        int expected = 5;
        //when
        ArrayList<Integer> diceRoll = game.getroll();
        int actual = diceRoll.size();
        //then
        Assert.assertEquals(actual, expected);
        diceRoll.clear();
    }

    @Test
    public void evaluateHandTest() {
        //given
        CasinoTesting game = new CasinoTesting();

        //when
        ArrayList<Integer> handEval = game.getroll();

        //then
        HashMap<String, Integer> expected = game.evaluateHand(handEval);
        handEval.clear();

    }

    @Test
    public void evaluatePlayerHand() {
        //given
        KlondikeGame game = new KlondikeGame();

        //when
        ArrayList<Integer> handEval = game.getPlayerRoll();

        //then
        HashMap<String, Integer> expected = game.evaluatePlayerHand();
        handEval.clear();
    }

    @Test
    public void getKlondikeHand() {
        KlondikeGame game = new KlondikeGame();
        ArrayList<Integer> roll = game.getHouseRoll();
        HashMap<String, Integer> expected = game.evaluateHouseHand();
        game.getKlondikeHand();
        roll.clear();
    }

    @Test
    public void isTwoPairTest() {
        ///given
        KlondikeGame game = new KlondikeGame();
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
    public void getPlayerKlondikeHandTest() {
        KlondikeGame game = new KlondikeGame();
        ArrayList<Integer> roll = game.getHouseRoll();
        HashMap<String, Integer> expected = game.evaluatePlayerHand();
        game.getPlayerKlondikeHand();
        roll.clear();
    }

    @Test
    public void getWinner() {
        //given
        KlondikeGame game = new KlondikeGame();
        game.houseHandRank = 5;
        game.playerHandRank = 4;
        String expected = "HOUSE WINS!!!!";
        //when
        String actual = game.getWinner();
        //then
        Assert.assertEquals(actual, expected);
    }


}