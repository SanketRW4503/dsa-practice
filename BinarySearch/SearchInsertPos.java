
// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPos{
    public static void main(String[] args) {

        int [] arr={1,3,5,6};
        int target =7;

        int ans= searchInsert(arr, target);
        System.out.println(ans);


    }


     static int searchInsert(int[] arr, int target) {
        int start=0;
        int end =arr.length-1;

        while (start<=end) {

            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target<arr[mid]){
                end=end-1;
            }else{
                start=start+1;
            }
        }

        return start;
        
    }
}