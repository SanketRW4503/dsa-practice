
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/
public class MountainPeak {
    public static void main(String[] args) {
        
        int [] arr={1,3,5,6,7,5,3,2,1};
        int ans=findpeak(arr);
        System.out.println(ans);
    }

    static int findpeak(int []arr){

        int start=0;
        int end=arr.length-1;
        
        while (start<end) {
                
            int mid= start+(end-start)/2;
        
            if(arr[mid]>arr[mid+1]){
                // you are in decreasing order
                end=mid;
            }else{
                // you are in ascending order
                start=mid+1;
            }

        }
        return start;

    }
}
