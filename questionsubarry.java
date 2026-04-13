

public class questionsubarry {
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int  n = scn.nextInt();
        

        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        */
        int [] arr = {1,2,3,4,5,6,7,8};
        int k=3;
        
        
        int max =Integer.MIN_VALUE;
        
        for(int i=0;i<=arr.length-k;i++){
            int score= 0;
            int pehle=i;
            for(int j=1;j<=k;){
                score +=(j++)*arr[i++];
                
            }
            max = Math.max(score, max);
            i = pehle;

        }
        System.out.println(max);
    }

}
