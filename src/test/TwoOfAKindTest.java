package test;

import game.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TwoOfAKindTest {
    private Cup cup = new Cup();
    private int[] totalTwoOfAKind = new int[] { 0, 0, 0, 0, 0, 0 };

    @Test
    public void testTwoOfAKindFreq() {
        for (int i = 0; i < 1000; i++) {
            cup.setRollSum();

            if (cup.getDie1() == cup.getDie2()) {
                switch (cup.getRollSum()) {
                    case 2:
                        totalTwoOfAKind[0] += 1;
                        break;
                    case 4:
                        totalTwoOfAKind[1] += 1;
                        break;
                    case 6:
                        totalTwoOfAKind[2] += 1;
                        break;
                    case 8:
                        totalTwoOfAKind[3] += 1;
                        break;
                    case 10:
                        totalTwoOfAKind[4] += 1;
                        break;
                    case 12:
                        totalTwoOfAKind[5] += 1;
                        break;
                }
            }
        }
        System.out.println("");
        System.out.println("Number of pairs for 1000 rolls: ");
        int sum = 0;
        double expectedNumberOfPairs = Math.round((double) 1000 * 0.16667 * 100.0) / 100.0;
        for (int i = 0; i < totalTwoOfAKind.length; i++) {
            sum += totalTwoOfAKind[i];
            System.out.println("Total pair of " + (i + 1) + ": " + totalTwoOfAKind[i]);
        }
        System.out.println("Total numbers of two of a kind: " + sum);
        System.out.println("Expected total number of pairs: " + expectedNumberOfPairs);

        double frequencyPairs = Math.round(((double) sum / 1000) * 100 * 100.0) / 100.0;
        double frequencyExpected = Math.round((expectedNumberOfPairs / 1000) * 100 * 100.0) / 100.0;

        System.out.println("Frequency of pairs: " + frequencyPairs + "%");
        System.out.println("Expected frequency of pairs: " + frequencyExpected + "%");

        assertEquals(frequencyExpected, frequencyPairs, 5.0);

    }

    @Test
    public void testTwoOfAKindFreqExtra() {
        for (int i = 0; i < 100000; i++) {
            cup.setRollSum();

            if (cup.getDie1() == cup.getDie2()) {
                switch (cup.getRollSum()) {
                    case 2:
                        totalTwoOfAKind[0] += 1;
                        break;
                    case 4:
                        totalTwoOfAKind[1] += 1;
                        break;
                    case 6:
                        totalTwoOfAKind[2] += 1;
                        break;
                    case 8:
                        totalTwoOfAKind[3] += 1;
                        break;
                    case 10:
                        totalTwoOfAKind[4] += 1;
                        break;
                    case 12:
                        totalTwoOfAKind[5] += 1;
                        break;
                }
            }
        }
        System.out.println("Number of pairs for 100000 rolls: ");

        int sum = 0;
        double expectedNumberOfPairs = Math.round((double) 100000 * 0.16666667 * 100.0) / 100.0;
        for (int i = 0; i < totalTwoOfAKind.length; i++) {
            sum += totalTwoOfAKind[i];
            System.out.println("Total pair of " + (i + 1) + ": " + totalTwoOfAKind[i]);
        }
        System.out.println("Total numbers of two of a kind: " + sum);
        System.out.println("Expected total number of pairs: " + expectedNumberOfPairs);

        double frequencyPairs = Math.round(((double) sum / 100000) * 100 * 100.0) / 100.0;
        double frequencyExpected = Math.round((expectedNumberOfPairs / 100000) * 100 * 100.0) / 100.0;

        System.out.println("Frequency of pairs: " + frequencyPairs + "%");
        System.out.println("Expected frequency of pairs: " + frequencyExpected + "%");

        assertEquals(frequencyExpected, frequencyPairs, 1.0);
    }
}
