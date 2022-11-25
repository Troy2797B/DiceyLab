import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    int numOfDice;
    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
        //the number of dice in the field is the same number of dice in the parameter
        //this constructor allows you to make a new dice object and sets the number of dice
//        this.numberOfDice = numberOfDice;
    }
//    public int getNumberOfDice() {
//        return numberOfDice;
//    }
//
//    public void setNumberOfDice(int numberOfDice) {
//        this.numberOfDice = numberOfDice;
//    }

    //create a dice class that acts like a set of N random tossed dies
    //fields include numberOfDice

    //    public static int getUserInput(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many die?");
//        return scanner.nextInt();
//    }
//
    public int tossAndSum() {
        int results = 0;
        int currentNumber = 0;
        for (int i = 1; i <= numOfDice; i++) {
            currentNumber = (int) ((Math.random() * 6) + 1);
            results= results + currentNumber;
        }
        System.out.println(results);
        return results;
    }
}
//
//    public static void main(String[] args) {
//        getUserInput();
//        roll();
//    }

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