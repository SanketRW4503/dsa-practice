public class ReverseNumber {
    public static void main(String[] args) {
        int n=1824;
        reverse(n);
        System.out.println();
    }

    static void reverse(int n){

        if(n==0){
            return;
        }

        // take last digit
        int lastnumber= n%10;
        // print last digit
        System.out.print(lastnumber);
        // take remaing number 
        int remNumber=n/10;
        // send remaing number to this function itself ....
        reverse(remNumber);

    }
}
