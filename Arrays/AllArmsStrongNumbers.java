public class AllArmsStrongNumbers {
    public static void main(String[] args) {
        
        for(int i=100;i!=1000;i++){
         boolean ans= isArmStrongNumber(i);
         if(ans){
            System.out.println(i+" ");
         }
        }
        
    }


    static boolean isArmStrongNumber(int number){
        int original=number;
        int sum=0;
        while (number>0) {
            int rem= number%10;
            sum=sum+rem*rem*rem;
            number=number/10;
        }
        return original==sum;
    }
}
