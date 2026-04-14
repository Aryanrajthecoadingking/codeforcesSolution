import java.util.*;

public class   Oie_excursion{
    public static void main(String[] args){

    
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int m = scn.nextInt();
            long [] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextLong();
            }
            long curr = 0;
            long prev = -1;
            long max_len = 0;
            long current_len = 0;
            for(int i=0;i<n;i++){
                curr = arr[i];
                if(prev == arr[i]){
                    current_len ++;
                    max_len = Math.max(max_len,current_len);
                }
                else{
                    current_len = 1;
                    prev = arr[i];
                }
                
                
            }
            if(max_len >=m){
                System.out.println("NO");
                    
            }
            else{
                System.out.println("YES");
            }
            
            
        }
    }
}