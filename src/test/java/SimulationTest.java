import org.junit.Test;

public class SimulationTest {
    @Test
    public double percentageOfAmountTest(){
        //given
        Integer numberOfTosses = 10;
        Integer numberOfDies = 2;
        //when
        Simulation sim = new Simulation();
        double actual = sim.percentageOfAmount(numberOfTosses, numberOfDies);
        //then

    }
}
