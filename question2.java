import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxIdx = n - 1;
        int minIdx = 0;
        int maxElem = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}