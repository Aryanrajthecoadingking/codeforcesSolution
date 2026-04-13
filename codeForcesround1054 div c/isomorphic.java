
import java.util.*;

public class isomorphic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(areIsomorphic(s1, s2) ? "Yes" : "No");
    }
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Boolean> used = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(smap.containsKey(c1)){
                if(smap.get(c1) != c2){
                    return false;
                }
            }
            else{
                if(used.containsKey(c2)){
                    return false;
                }
                smap.put(c1,c2);
                used.put(c2,true);
            }
            
        }
        return false;
    }
}