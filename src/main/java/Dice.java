import java.sql.SQLOutput;
import java.util.Random;

public class Dice {
    int numOfDice;
//    int rollResult;
    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }
    public static int roll(int numOfDice){
        //make something that rolls randomly betweeen 1 and 6
        Random ran = new Random();
        int result = 0;
        for(int i = 0 ; i <= numOfDice + 1; i++) {
            result = ran.nextInt();
            //do it how many times the user wants to do it
        } return result;
    }
    //Create a Dice class that acts like a set of N random-tossed dies.
    //Method for rolling
    //what are properties of dice? these are my fields. So numberOfSides and numberOfDice

}
