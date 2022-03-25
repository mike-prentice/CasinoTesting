import Java.src.CasinoTesting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

class DiceTest {

    @org.junit.jupiter.api.Test
    @Test
    void rollFalse() {
        CasinoTesting roll = new CasinoTesting();

        Random diceNumber = new Random();

        int[] actual = rollDice();
        for (int i = 0; i < actual.length; i++) {
            Assert.assertFalse(actual[i] > 0 && actual[i] > 7);
        }
    }

    @Test
    int[] rollDice() {
        //when
        CasinoTesting newRoll = new CasinoTesting();
        Random dice = new Random();
//        Random diceNumber= new Random();
        //then
        int[] actual = rollDice();
        for (int j : actual) {
            //
            Assert.assertTrue(j > 0 && j < 7);
        }
        return actual;
    }
}