
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class CountEvenDigit {
    public static void main(String[] args) {
     
        int [] arr={555,901,482,1771};
        int count=0;
        for(int i=0;i!=arr.length;i++){

          int totalDigits= countDigit(arr[i]);
            
          boolean result= checkEven(totalDigits);
            
          if(result){
            count++;
          }
        }
        System.out.println(count);

    }

    static boolean checkEven(int totalDigits){

        if(totalDigits%2==0){
            return true;
        }

        return false;
    }

    static int countDigit(int number){
        
        if(number<0){
            number = Math.abs(number);
        }

        if(number==0){
            return 1;
        }
        int count =0;
        while(number>0){

            count++;
            number=number/10;
        }
        return count;
       
    }
}
