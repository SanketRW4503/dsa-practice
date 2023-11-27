import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number=sc.nextInt();
        while(number>0){
            int rem= number % 10;
            System.out.print(rem);
            number=number/10;

        }
  
    }
}