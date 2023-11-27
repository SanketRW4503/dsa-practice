
import java.util.Scanner;

public class Array2ds {

    public static void main(String[] args) {
        int [][] arr= new int[3][3];
        Scanner sc= new Scanner(System.in);

        for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                arr[rows][cols]=sc.nextInt();
            }
        }

        // printing
          for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                System.out.print(arr[rows][cols]+" ");
            }
            System.out.println();
        }

    }

    
} 
