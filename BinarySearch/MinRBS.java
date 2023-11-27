
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

// pending

public class MinRBS {
    public static void main(String[] args) {

        int[] arr = {1};
        int ans=-1;
        if(arr[0]<arr[arr.length-1] ){

           ans=arr[0];
            
        }else{
          ans = findingMinRBS(arr);
        
        }
        System.out.println(ans);
      
    }

    static int findingMinRBS(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

       

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // case1
            if (mid<end && arr[mid] > arr[mid + 1] ) {
                return arr[mid + 1];
            }

            // case2
            if (start>mid && arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            }

            // case3
            if (arr[mid] < arr[start]) {
                end = mid;
            } else {
                start = end + 1;
            }

        }

        return -1;

    }
}
