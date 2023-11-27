
// https://leetcode.com/problems/intersection-of-two-arrays/
// pending 

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArray {

    public static void main(String[] args) {

        int[] arr = { 4, 9, 5 };
        int[] arr2 = { 9, 4, 9, 8, 4 };

        int[] ans = intersection(arr, arr2);

        System.out.println(Arrays.toString(ans));

    }

    static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>(5);

        for (int i = 0; i != nums1.length - 1; i++) {

            for (int r = 0; r != nums2.length - 1; r++) {

                if (nums1[i] == nums2[r] && !arr.contains(nums1[i])) {
                    arr.add(nums2[r]);
                }

            }

        }

        int[] ans = new int[arr.size()];
        for (int i = 0; i != arr.size() - 1; i++) {

            ans[i] = arr.get(i);
        }
        return ans;

    }

}