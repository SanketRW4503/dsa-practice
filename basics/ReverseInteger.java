
// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        int ans = run(x);
        System.out.println(ans);
    }

    static int run(int x) {

        long number = 0;
        while (x != 0) {
            int lastDig = x % 10;
            number += lastDig;
    
            number = number * 10;
            x = x / 10;
        }
        number = number / 10;
        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) (-1 * number);
        }
        return (int) number;

    }

}
