public class TopLeftPyramid {
    public static void main(String[] args) {

        int value=5;
        for(int rows=0;rows<=value;rows++){

            // print the stars
            for(int cols =value;cols!=rows;cols--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
