public class Simulation {
    Simulation sim = new Simulation();
    Integer numberOfDies;
    Integer numberOfTosses;

    public Simulation(){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public double percentageOfAmount(Integer numberOfTosses, Integer numberOfDies){
        Dice dice = new Dice(numberOfDies);
        Double percentage = (double) (dice.tossAndSum() / numberOfTosses);
        return percentage *100;
    }
    public static void main(String[] args) {

    }


}
