package stepByStep.array;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        Arrays.sort(array);
        double max = array[n-1];

        for (int i = 0; i < n; i++) {
            array[i] = array[i]/max*100;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        System.out.println(sum/n);
    }
}
