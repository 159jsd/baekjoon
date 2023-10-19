package stepByStep.deepen;

import java.util.Scanner;

public class VocaStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] array1 = new int[26];

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < array1.length; j++) {
                if(s.charAt(i) == 65 + j) {
                    array1[j]++;
                }
            }
        }

        int max = -1;
        char as = '?';

        for(int i = 0; i < array1.length; i++) {
            if(max < array1[i]) {
                max = array1[i];
                as = (char) (i + 65);
            }
            else if(max == array1[i]) {
                as = '?';
            }
        }
        System.out.println(as);
    }
}
