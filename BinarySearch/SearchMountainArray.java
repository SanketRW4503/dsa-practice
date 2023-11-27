

// https://leetcode.com/problems/find-in-mountain-array/

public class SearchMountainArray {
    public static void main(String[] args) {
        int [] arr={1,3,5,8,9,7,6,2,1};

        int target=8;

        int peak= findPeakIndex(arr);
     

        int check1=   orderAgnosticBS(arr,0,peak,target,true);
        if(check1==-1){
        int check2=   orderAgnosticBS(arr,peak,arr.length-1,target,false);
        System.out.println(check2);
        }else{
            System.out.println(check1);
        }
         

              
        

    }

    static int orderAgnosticBS(int[] arr, int start ,int end, int target,boolean isAsc){
     
    
        while (start<=end) {
            
            int mid= start+(end-start)/2;
            
            if(arr[mid]==target){
                return mid;
            }

            if (isAsc) {
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }


        }
        return -1;

    }

    static int findPeakIndex(int[] arr){
        int start=0;
        int end =arr.length-1;

        while (start<end) {
            
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                // you are in decreasing order
                end=mid;
            }else{
                start=mid+1;
            }
        }

        return start;
    }
}
