
// https://leetcode.com/problems/binary-search

public class BinarySearch1 {
    public static void main(String[] args) {
            int [] arr={1,3,5,7,9,12,24,43};
            int target=43;
            int ans=Binarysearch(arr,target);
            System.out.println(ans);
    }

    // this will return index number of target element 
    static int Binarysearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid= start+(end -start)/2;
            
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }

        }


        return -1;
    }
}
