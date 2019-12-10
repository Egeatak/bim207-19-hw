
import java.io.IOException;
import java.util.*;

public class Main{

    public Main(String fileName, int topN) throws IOException {
        //Complete this constructor

        computeEntropy();
        computeAvgLength();
        Set pairs = calculateFactor();
    }

    private void computeEntropy() {
        //Fill this function
    }

    private void computeAvgLength() {
        //Fill this function

    }

    private Set calculateFactor() {
        //Fill this function


        return null;
    }




    public static void main(String[] args) throws IOException {
        new Main(args[0],Integer.parseInt(args[1]));

    }


}
