public class RotatedArrayBS {
    public static void main(String[] args) {
        int []arr={23,32,45,56,499,0,1,3,4};
        int target=3;
        int peak=findPeakIndex(arr, 0, arr.length-1);

        if(arr[peak]==target){
            System.out.println(peak);
        }else{
            if(arr[0]>target){
                int ans=binarysearch(arr, peak+1,arr.length-1,target);
                System.out.println(ans);
            }else{
                int ans= binarysearch(arr, 0, peak,target);
                                System.out.println(ans);

            }
        }

        
    }

    static int binarysearch(int[] arr, int start,int end,int target){
        int mid= start+(end-start)/2;
        // case1
        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            end=mid-1;
            return binarysearch(arr, start, end, target);
        }else{
            start=mid+1;
            return binarysearch(arr, start, end, target);

        }

    }

    static int findPeakIndex(int[] arr,int start,int end){
        int mid=start+(end-start)/2;
        // case 1
        if(arr[mid]>arr[mid+1]   ){
            return mid;
        }

        // case 2

        if(arr[mid]<arr[mid-1]){
            return mid;
        }

        // case 3
        if(arr[mid]<arr[start]){
            end=mid-1;
            return findPeakIndex(arr, start, end);
        }else{
            start=mid;
            return findPeakIndex(arr, start, end);
        }

    }
}
