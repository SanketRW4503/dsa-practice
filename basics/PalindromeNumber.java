

// https://leetcode.com/problems/palindrome-number
public class PalindromeNumber{
    public static void main(String[] args) {
        int number=1212;
        boolean ans= isPalindrome(number);
        System.out.println(ans);
    }
    static  boolean isPalindrome(int x) {
        
        String num=x+"";
        
        int start=0;
        int end =num.length()-1;
        while (start<=end) {
            if(num.charAt(start)!=num.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }


        }
    
        return true;
        
    }
}