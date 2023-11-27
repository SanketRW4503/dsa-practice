
// https://leetcode.com/problems/richest-customer-wealth/

public class RichCustomer {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 55, 1 } };

        int answer = maximumWealth(accounts);
        System.out.println(answer);
    }

    static int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for (int rows = 0; rows != accounts.length; rows++) {
            int sum = 0;
            for (int cols = 0; cols != accounts[rows].length; cols++) {
                sum += accounts[rows][cols];
            }
            if (sum > maxwealth) {
                maxwealth = sum;
            }
        }

        return maxwealth;

    }
}
