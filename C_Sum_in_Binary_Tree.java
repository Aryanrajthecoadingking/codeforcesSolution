import java.util.*;
public class C_Sum_in_Binary_Tree{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            long n = scn.nextLong();
            solve(n);
        }
    }
    static void solve(long n ){
        long sum = 0;
        long temp = n;
        while(temp != 0){
            sum +=temp;
            temp = temp/2;
        }
        System.out.println(sum);
    }
}