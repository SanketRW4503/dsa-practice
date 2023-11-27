

//// this problem is almost similar to disappeared array numbers problem : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

// https://leetcode.com/problems/missing-number/

public class MissingNumber {

    public static void main(String[] args) {
        int []arr={0,1};

        int missingNumber=sort(arr);
        System.out.println(missingNumber);

    }

    static int sort(int []arr){

        int i=0;
        while (i<arr.length) {
            if(arr[i]!=i && arr[i]<arr.length-1){
                
                swap(arr,arr[i],i);
            }else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }

        return arr.length;

    }

        static void swap(int[]arr,int firstIndex,int secondIndex){

        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;

    }
    
}
