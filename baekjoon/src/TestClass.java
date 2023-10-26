import java.io.*;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int init = 2;

        for (int i = 0; i < n; i++) {
            init = init * 2 - 1;
        }

        System.out.println(init * init);

    }
}
