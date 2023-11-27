import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three digit number:");
        int number= sc.nextInt();
        boolean ans=isArmStrongNumber(number);
        System.out.println(ans);
    }

    static boolean isArmStrongNumber(int number){
        int sum=0;
        int original=number;
        while (number>0) {
            int rem= number%10;  
            sum=sum+rem*rem*rem;
            number=number/10;
        }
        
        return original==sum;
    }
}
