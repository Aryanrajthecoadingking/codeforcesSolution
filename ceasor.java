
import java.util.Scanner;

public class ceasor{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();
        String ans ="";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            char newchar =(char) ((ch + k-97)%26 + 97);
            ans +=newchar;
        }
        System.out.println(ans);
    }
}