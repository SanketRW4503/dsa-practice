
// https://leetcode.com/problems/arranging-coins/

// pending
public class ArrangingCoins {
    public static void main(String[] args) {
        
        int n=3; //initial input given by leetcode
        int coins=n;
        
        int staircase=0;
        for(int i=1;i<=n;i++){
          
            if(coins>=i ){
                coins=coins-i;
                staircase++;
           
            }else{
                break;
            }
        }

        System.out.println(staircase); 

    }
}
