import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinsTest {

    @Test
    public void binConstructorTest(){
        //given
        Integer binMin = 2;
        Integer binMax = 12;
        //when
        Bins bin = new Bins(binMin, binMax);
        //then
        Integer expected = 11;
        Integer actual = bin.resultsMap.size();
        assertEquals(expected,actual);
    }

    @Test
    public void binConstructorTest2(){
        //given
        Integer binMin = 5;
        Integer binMax = 30;
        //when
        Bins bin = new Bins(binMin, binMax);
        //then
        Integer expected = 26;
        Integer actual = bin.resultsMap.size();
        assertEquals(expected,actual);
    }


   @Test
    public void incrementBinTest() {
        //given
       Integer resultNumber = 18;
       Integer binMin = 4;
       Integer binMax = 24;
       //when
       Bins bin = new Bins(binMin, binMax);
       bin.incrementBin(18);
       //then
       Integer expected = 1;
       Integer actual = bin.resultsMap.get(18);
      assertEquals(expected, actual);
    }
//    @Test
//    public double percentageOfAmountTest(){
//        Bins bins = new Bins();
//
//    }
}
