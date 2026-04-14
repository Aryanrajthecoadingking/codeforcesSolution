import java.util.*;
public class Blocked {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int [] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
                max = Math.max(max,arr[i]);
            }
            int [] count = new int[max+1];
            boolean flag = true;
            for(int val : arr){
                count[val]++;
                if(count[val]>1){
                    flag = false;
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int val : arr){
                list.add(val);
                
            }
            Collections.sort(list);
            Collections.reverse(list);
            if(flag == false){
                System.out.println(-1);
            }
            else{
                for(int val : list){
                    System.out.println(val);
                }
            }
        }
    }
}
