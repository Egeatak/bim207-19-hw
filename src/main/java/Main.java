
import java.io.IOException;
import java.util.*;

public class Main{

    public Main(String fileName, int topN) throws IOException {
        //Complete this constructor

        computeEntropy();
        computeAvgLengthByFirstChar();
        Set pairs = calculateMinPairDist();
    }

    private void computeEntropy() {
        //Fill this function
    }

    private void computeAvgLengthByFirstChar() {
        //Fill this function

    }

    private Set calculateMinPairDist() {
        //Fill this function


        return null;
    }aaa




    public static void main(String[] args) throws IOException {
        new Main(args[0],Integer.parseInt(args[1]));

    }


}
