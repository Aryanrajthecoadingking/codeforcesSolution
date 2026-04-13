
import java.util.Scanner;

public class jar {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int input = scn.nextInt();
        
        if(input>=1 && input<=k){
            System.out.println(input);
            System.out.println(n-input);
        }
        else{
            System.out.println("invalid input");
            System.out.println(n);
        }
    }
}
