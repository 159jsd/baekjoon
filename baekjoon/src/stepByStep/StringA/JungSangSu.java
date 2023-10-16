package stepByStep.StringA;

import java.util.Scanner;

public class JungSangSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String num1 = "";
        String num2 = "";
        for(int i = 3; i > 0; i--) {
            num1 += s1.substring(i-1, i);
        }
        for(int i = 3; i > 0; i--) {
            num2 += s2.substring(i-1, i);
        }
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);
        if(num3 > num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }
    }
}
