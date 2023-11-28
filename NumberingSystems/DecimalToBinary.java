public class DecimalToBinary {
    public static void main(String[] args) {
        
        int value=3;
        String ans="";
        while (value!=1) {

            ans=ans+value%2;
           
            value=value/2;

        }
        
        int binary= Integer.parseInt(value+ans) ;
        System.out.println(binary);



    }
}
