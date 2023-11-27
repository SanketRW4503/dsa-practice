public class Palindrome{
    public static void main(String[] args) {
        String str="abcdcba";

        int start=0;
        int end =str.length()-1;
        boolean ans=true;
        while (start<=end) {
            if(str.charAt(start)!=str.charAt(end)){
                ans=false;
                break;
            }else{
                start++;
                end--;
            }
        }
       if(ans){
        System.out.println("Given String is Palindrome String");

       }else{
        System.out.println("Given String is not Palindrome String");
       } 

    }
}