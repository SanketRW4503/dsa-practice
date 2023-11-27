
// this problem is almost similar to missing number problem :// https://leetcode.com/problems/missing-number/

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        int i=0;
        while(i<nums.length){
            // {0-1,1-2,2-3,3-4,4-5}
           int correct=nums[i]-1;
           
           if(nums[i]!=correct && nums[correct]!=nums[i]){
                
                 swap(nums, i, correct);
           }else{
            i++;
           }


        }


        // checking which numbers are missing
        List<Integer> list= new ArrayList<>();
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
              list.add(j+1);
            }
        }

        System.out.println(list);

    
        
    }

    static void swap(int []arr,int firstIndex,int secondIndex){
        int temp= arr[secondIndex];
        arr[secondIndex]= arr[firstIndex];
        arr[firstIndex]=temp;
    }

}
