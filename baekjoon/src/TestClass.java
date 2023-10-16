import java.io.*;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), "");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());


        br.close();

        bw.flush();
        bw.close();
    }
}
