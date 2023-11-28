public class SumOfDigits {
    
    public static void main(String[] args) {
        
        int n=1101;

        System.out.println(ans(n));


    }

    static int ans(int n){
        if(n==0){
            return 0;
        }
        int number=n%10;
        int nextNumber= n/10;
        return number+ans(nextNumber);

    }
}
