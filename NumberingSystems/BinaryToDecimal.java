public class BinaryToDecimal {
    public static void main(String[] args) {
        int binaryNumber=0010;
        int decimal=0;
        int i=0;
        while (binaryNumber!=0) {

            int rem=binaryNumber %10;
            int ans=rem*power(2, i);
            decimal=decimal+ans;
            binaryNumber=binaryNumber/10;
            i++;
        }   
        System.out.println(decimal);
        
    }

    static int power(int n ,int p){
        int ans =0;
        if(p==0){
            return 1;
        }
        for(int i=0;i!=p;i++){
            ans+=2*2;
        }
        return ans;
    }
}
