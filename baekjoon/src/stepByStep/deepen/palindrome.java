package stepByStep.deepen;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int palindromeFlag = 1;

        for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    palindromeFlag = 0;
                }
        }
        System.out.println(palindromeFlag);
    }
}
