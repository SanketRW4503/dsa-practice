
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstLastElement {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] ans = new int[2];
        int first = bs(arr, target,true);
        int second = bs(arr, target,false);
        ans[0] = first;
        ans[1] = second;

        System.out.println(Arrays.toString(ans));
    }

    static int bs(int[] arr, int target ,boolean firstIndex) {

        int start = 0;
        int end = arr.length - 1;

        int tempans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                tempans = mid;
                if(firstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
             
               
            }

        }
        return tempans;
    }

}