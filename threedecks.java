
import java.io.*;
import java.util.*;

public class threedecks {
    public static void main(String[] args) throws IOException {
        // Fast I/O setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine()); // number of test cases
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // logic goes here
            int sum = a + b + c;
            if (sum % 3 != 0) {
                out.println("NO");
            } else {
                int target = sum / 3;
                if (target >= a && target >= b && target <= c) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }
        }

        out.flush(); // always flush the output
    }
}

    

