import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bins {

    int binMin;
    int binMax;

    ArrayList<Integer> bin;

    public Bins(int binMin, int binMax) {
        this.binMax = binMax;
        this.binMin = binMin;
    }

    public int getBinMin() {
        return binMin;
    }

    public int getBinMax() {
        return binMax;
    }

    //returns the number of times the value assigned to parameter shows up in the corresponding bin
    public int getBin(Integer resultNumber) {
        return bin.indexOf(resultNumber);

    }

    public void incrementBin(Integer resultNumber) {
        int numOfNum = 0;
        for (int i = 0; i < bin.size(); i++) {
            if (i == resultNumber) {
                bin.set(resultNumber, numOfNum);
                numOfNum++;

            }
        }
//        bin.indexOf(resultNumber);
    }
}



