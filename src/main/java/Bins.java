import java.util.HashMap;

public class Bins {

    int binMin;
    int binMax;

    HashMap<Integer, Integer> resultsMap = new HashMap<Integer, Integer>();

    public Bins(int binMin, int binMax) {
        this.binMin = binMin;
        this.binMax = binMax;
        for(Integer i = binMin; i <= binMax; i++){
            resultsMap.put(i,0);
        }
    }

    public int getBinMin() {
        return binMin;
    }

    public int getBinMax() {
        return binMax;
    }

    //returns the number of times the value assigned to parameter shows up in the corresponding bin
    public int getBin(Integer resultNumber) {
        return resultsMap.get(resultNumber);

    }

    //this increments the bin number...

    public void incrementBin(Integer resultNumber) {
        int valueOfKey = resultsMap.get(resultNumber);
        valueOfKey++;
        resultsMap.put(resultNumber, valueOfKey);
    }

    public double percentageOfAmount(HashMap<Integer, Integer> resultsMap){

//        double crazyDecimal = resultsMap.get() / numberOfTosses;
//        double percentage = crazyDecimal * 100;
        return 0.0;

//        Dice dice = new Dice(numberOfDies);
//        Double percentage = (double) (dice.tossAndSum() / numberOfTosses);
//        System.out.println(percentage);
//        double realPercentage = percentage *100;
//        System.out.println(realPercentage);
//        return realPercentage;
    }


}



