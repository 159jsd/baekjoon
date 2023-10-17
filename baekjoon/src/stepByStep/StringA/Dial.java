package stepByStep.StringA;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] array = new String[8];

        array[0] = "ABC";
        array[1] = "DEF";
        array[2] = "GHI";
        array[3] = "JKL";
        array[4] = "MNO";
        array[5] = "PQRS";
        array[6] = "TUV";
        array[7] = "WXYZ";

        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[j].contains(""+s.charAt(i))) {
                    answer += j + 3;
                }
            }
        }

        System.out.println(answer);

    }
}
