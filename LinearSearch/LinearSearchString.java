public class LinearSearchString {
    public static void main(String[] args) {
        String str= "Hello";
        char target='e';
        boolean ans= linearSearch(str, target);
        System.out.println(ans);
    }
    static boolean linearSearch(String str, char target){

    

        for(int index=0;index!=str.length();index++){
            if(target==str.charAt(index)){
                    return true;
            }
        }

        return false;
    }
}
