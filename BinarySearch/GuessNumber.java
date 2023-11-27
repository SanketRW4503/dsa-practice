
// https://leetcode.com/problems/guess-number-higher-or-lower/



public class GuessNumber {

    public static void main(String[] args) {
     
        int n=10; //this is leetcode input

        int start = 1;
        int end = n;
        int ans= gameplay(start,end);
        System.out.println(ans);

    }

    static int gameplay(int start,int end){
        while (start <= end) {
                    int mid = start + (end - start) / 2;
                    int result = guess(mid);
                    if (result == 0) {
                        return mid;
                    }
                    if (result == 1) {
                        start = mid + 1;
                    } else if (result == -1) {
                        end = mid - 1;
                    }
                }
        return -1;
    }
    


    // its predefined function in leetcode 
    static int guess(int number) {
        int value = 1;
        int revalue = -1;
        if (number == value) {
            revalue = 0;
        }
        if (number > value) {
            revalue = -1;
        }
        if (number < value) {
            revalue = 1;
        }
        return revalue;
    }
}
