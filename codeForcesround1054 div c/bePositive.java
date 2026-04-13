
import java.util.*;

public class bePositive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = scn.nextInt(); // size of array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();  // read array elements
            }

            int result = solution(arr);
            System.out.println(result);
        }
        scn.close();
    }

    public static int solution(int[] arr) {
        int ans = 0;
        int negCount = 0;

        for (int x : arr) {
            if (x == -1) {
                negCount++;
            } else {
                ans += 1 - x; // if 0 → +1 op, if 1 → +0 ops
            }
        }

        // if odd number of negatives, need 2 more ops to fix product
        if (negCount % 2 != 0) {
            ans += 2;
        }
        return ans;
    }
}
