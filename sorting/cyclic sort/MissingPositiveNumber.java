
// https://leetcode.com/problems/first-missing-positive/


public class MissingPositiveNumber{
    
    public static void main(String[] args) {
        
        int [] arr={1,1};
        int ans= firstMissingPositive(arr);
        System.out.println(ans);


    }
    
    static int firstMissingPositive(int[] arr){
        
        int i=0;
        while (i<arr.length) {
            
            if(arr[i]!=i+1 && arr[i]>0){
                
                int correct= arr[i]-1;
                if(correct<arr.length-1 & arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }

            }else{
                i++;
            }
        }


        // check for positive missing number
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
            return i+1;
            }
        }
        return arr.length+1;
    }
     static void swap(int []arr,int firstIndex,int secondIndex){
        int temp= arr[secondIndex];
        arr[secondIndex]= arr[firstIndex];
        arr[firstIndex]=temp;
    }

}
