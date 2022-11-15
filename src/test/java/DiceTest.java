import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

//    @Test
//    public void diceConstructorTest(){
//        //given when then
//        Dice dice = new Dice(2);
//        int expected= 2;
//        int actual= dice.getNumberOfDice();
//        Assert.assertEquals(expected, actual);
//        //to test the constructor, you call the getter method because the field is private
//        //because you call the getter method there is no need to test the getter
//        //all there is left to do is test the settter
//    }
    @Test
    public void tossAndSumTest(){
        //given when then
        Dice dice = new Dice(5);
        int actual = dice.tossAndSum();
        assertTrue(actual <= 30 && actual >=5);
    }
    @Test
    public void tossAndSumTest1(){
        //given when then
        Dice dice = new Dice(8);
        int actual = dice.tossAndSum();
        assertTrue(actual <= 48 && actual >= 8);
    }
    @Test
    public void tossAndSumTest2(){
        //given when then
        Dice dice = new Dice(2);
        int actual = dice.tossAndSum();
        assertTrue(actual <= 12 && actual >= 2);
    }
//    @Test
//    public void testSetNumOfDice() {
//        Dice dice = new Dice(10);
//        dice.setNumberOfDice(4);
//        assertTrue (dice.getNumberOfDice() == 4);
//
//    }

    //I want a roll method
    //I want a number of turns method



}
