
import java.util.Scanner;

public class tcsPyq1 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int total_b = scn.nextInt();
        int total_p = scn.nextInt();
        int k = scn.nextInt();
        int j = scn.nextInt();

        int result = solution(n,total_b,total_p,k,j);
        System.out.println(result);

    }
    public static int solution(int n , int total_b,int total_p,int k , int j){
        int full_banana_eat = total_b/k;
        int full_peanut_eat = total_p/j;
        int left_b= total_b %k;
        int left_p = total_p %j;
        int road_cross = full_banana_eat + full_peanut_eat;
        if(left_b >0 || left_p>0){
            road_cross +=1;

        }
        
        return n-road_cross;
    }
}
