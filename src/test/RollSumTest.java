package test;

import game.*;

public class RollSumTest {
    private Cup cup = new Cup();
    private int[] values = new int[11];
    private double[] frequency = new double[11];
    private double[] expectedFrequency = new double[] { 2.78, 5.56, 8.33, 11.11, 13.89, 16.67, 13.89, 11.11, 8.33, 5.56,
            2.78 };

    public void testRollSum() {
        for (int i = 0; i < 100000; i++) {
            cup.setRollSum();

            switch (cup.getRollSum()) {
                case 2:
                    values[0] += 1;
                    break;
                case 3:
                    values[1] += 1;
                    break;
                case 4:
                    values[2] += 1;
                    break;
                case 5:
                    values[3] += 1;
                    break;
                case 6:
                    values[4] += 1;
                    break;
                case 7:
                    values[5] += 1;
                    break;
                case 8:
                    values[6] += 1;
                    break;
                case 9:
                    values[7] += 1;
                    break;
                case 10:
                    values[8] += 1;
                    break;
                case 11:
                    values[9] += 1;
                    break;
                case 12:
                    values[10] += 1;
                    break;
            }
        }

        for (int i = 0; i < values.length; i++) {
            double frequencyCalculator = (double) ((values[i] / 100000.0) * 100.0);
            frequency[i] = Math.round(frequencyCalculator * 100.00) / 100.00;
            System.out.println("Total of " + (i + 2) + ": " + values[i]);
            System.out.println("Frequency of " + (i + 2) + ": " + frequency[i] + "%");
            System.out.println("Expected frequency: " + expectedFrequency[i] + "%");
        }
    }

}
