

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfSteps {
    public static void main(String[] args) {
        int num=123;
        numberOfSteps(num);
        System.out.println(count);
    }

    static int count=0;
     static void numberOfSteps(int num) {

        if(num==0){
            return ;
        }

        if(num%2==0){
            numberOfSteps(num/2);
            count++;
        }else{
            count++;
            numberOfSteps(num-1);
        }
        

    }
}
