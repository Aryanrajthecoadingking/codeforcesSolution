import java.util.*;


public class Grid_L {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int p = scn.nextInt();
            int q =  scn.nextInt();
            
            long temp = ( 2*p) +(4*q )+1;
            ArrayList<Long> div = get_div(temp);
            boolean flag = false;
            for(long v : div){
                long x = v;
                long y = temp/x;
                long n = (x-1)/2;
                long m = (y-1)/2;
                if(Math.min(n*(m+1) , m*(n+1))>=q){
                    System.out.println(n+" "+m);
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(-1);
            }

        }
    }
    static ArrayList<Long> get_div(long n){
        ArrayList<Long> ans = new ArrayList<>();
        for(int d=1;d*d<=n;d++){
            if(n%d==0){
                ans.add(1L*d);
                if(d*d <n){
                    ans.add(n/d);
                }
            }
        }
        return ans;
    }
}
