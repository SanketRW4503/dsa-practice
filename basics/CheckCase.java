import java.util.Scanner;

public class CheckCase {
    
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().trim().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println("LOWERCASE");
        }else{
            System.out.println("UPPERCASE");
        }
    }
}
