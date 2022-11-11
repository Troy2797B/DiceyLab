import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int numberOfDice;
    public Dice(int numberOfDice){
        //the number of dice in the field is the same number of dice in the parameter
        //this constructor allows you to make a new dice object and sets the number of dice
        this.numberOfDice = numberOfDice;
    }
    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    //create a dice class that acts like a set of N random tossed dies
    //fields include numberOfDice

    public int roll(){
        int result = 0;
        for (int i = ; i >= 0; i--){
            result = (int) (Math.random()* 6 +1);
            if (i == 0){
                break;
            }
        } return result;

    }



}
//    int numOfDice;
////    int rollResult;
//    public Dice(int numOfDice){
//        this.numOfDice = numOfDice;
//    }
//    public static int roll(int numOfDice){
//        //make something that rolls randomly between 1 and 6
//        Random ran = new Random();
//        int result = 0;
//        for(int i = 0 ; i <= numOfDice + 1; i++) {
//            result = ran.nextInt();
//            //do it how many times the user wants to do it
//        } return result;
//    }
//    //Create a Dice class that acts like a set of N random-tossed dies.
//    //Method for rolling
//    //what are properties of dice? these are my fields. So numberOfSides and numberOfDice}