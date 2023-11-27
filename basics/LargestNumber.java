import java.util.Scanner;

class  LargestNumber {
    public static void main (String [] args){
        System.out.println("Enter Three Numbers");
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int ans= Math.max(c, Math.max(a,b));
            System.out.println("largest number is "+ans);
        }
    }
}