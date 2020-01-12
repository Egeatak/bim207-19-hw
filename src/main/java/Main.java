
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.util.List;
import  java.util.ArrayList;

public class Project_bim207 {
    public Scanner scanner;
    public ArrayList<String> indexOfWords = new ArrayList<String>();
    public ArrayList<String> otherGuys = new ArrayList<String>();
    int[] numOfOtherGuys;
    public double numOfWord = 1, hece, entropy;

    public Project_bim207(String fileName, int topN) throws IOException {
        //Complete this constructor

        try {
            scanner = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] a = line.split(" ");
            for (int i = 0; i < a.length; i++) {
                // System.out.println(a[i]);
                if (a[i].length() != 0) {

                    String[] b = a[i].split("'");
                    if (b.length == 2)
                        a[i] = b[0].concat(b[1]);
                    String[] c = a[i].split("\\.");
                    if (c.length == 2)
                        a[i] = c[0].concat(c[1]);
                    String[] d = a[i].split("-");
                    if (d.length == 2)
                        a[i] = d[0].concat(d[1]);
                    if ((a[i].substring(a[i].length() - 1).equals(",")) || (a[i].substring(a[i].length() - 1).equals("."))) {
                        a[i] = a[i].substring(0, (a[i].length() - 1));
                        // System.out.println(a[i]);
                    }
                    indexOfWords.add(a[i].toLowerCase());
                    //  numOfWord++;
                    hece += a[i].length();
                } // end of if
            }  // end of for
        } // end of while
        computeEntropy();

    }

    private void computeEntropy() {
        // COMPUTE ENTROPY
        for (int i = 0; i < indexOfWords.size(); i++) {
            numOfWord = 0;
            String searchGuy = indexOfWords.get(i);
            for (int j = 0; j < indexOfWords.size(); j++) {
                if (searchGuy.equals(,indexOfWords.get(j)))
                    numOfWord++;
            }
            double Pt = (numOfWord / (indexOfWords.size()));
            entropy += Pt * (Math.log(Pt) / Math.log(2));
        }
        System.out.println("Entropy : " + ((-1) * entropy));
    }
}
