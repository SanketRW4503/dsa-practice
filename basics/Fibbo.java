import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int a=0;
        int b=1;
        int i =0;
        while (i!=number) {
            
            int temp=b;
            b=a+b;
            a=temp;
            i++;
        }
        System.out.println("Fibonnaci Number at "+number+"is "+b);

        

    }

}
