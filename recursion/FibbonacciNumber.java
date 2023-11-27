
//https://leetcode.com/problems/fibonacci-number
public class FibbonacciNumber {
    public static void main(String[] args) {
        int n=4;

        System.out.println(fibbo(n));
    }
    static int fibbo(int n){
        
        if(n==0 ){
            return n;
        }
         if(n==1 ){
            return n;
        }

        return fibbo(n - 1) + fibbo(n - 2);
    }
}
