public class LeftPyramid {
    public static void main(String[] args) {
        for(int rows=0;rows<=4;rows++){
           for(int space=5;space!=rows;space--){
            System.out.print(" ");
           }
           for(int star=0;star<=rows;star++){
            System.out.print("* ");
           }
           System.out.println();
         
        }
    }
}
