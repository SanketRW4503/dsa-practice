public class CountZero {
    static int totalzero=0;
    static void countZero(int n){

        

        int lastdigit=n%10;
        if(lastdigit==0){
            totalzero++;
        }

        if(n==lastdigit){
            return ;
        }else{
           countZero(n/10);
        }

    }
    public static void main(String[] args) {
        
        int n=1010;
        countZero(n);
        System.out.println("total no of zeros are "+totalzero);
    }
}
