import java.util.*;
public class quest1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count =0;
        int length =1;
        for (int i =1;i<n;i++)
        {
            if(arr[i]>arr[i-1]){
                length++;
            }
            else{
                if(length >=2){
                    count +=(length * (length-1))/2;
                }
                length=1;
            }
            
        }
        if(length >=2){
            count +=(length * (length-1))/2;
        }
        System.out.println(count);

    }
}
