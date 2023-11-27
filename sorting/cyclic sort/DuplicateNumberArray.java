
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberArray {
    public static void main(String[] args) {
         int []arr={3,1,3,4,4,2};
        
        List<Integer> list= cyclicsort(arr);
        System.out.println(list);
    }

    static List<Integer>cyclicsort(int [] arr){
    int i=0;
        while (i<arr.length) {
            
            if(arr[i]!=i+1){
                int correct= arr[i]-1;
                if(arr[i]!=arr[correct]){    
                
                    swap(arr, i, correct);
                
                }else{
                    i++;
                }  
            }else{
                i++;
            }
        }

        List<Integer> list= new ArrayList<>();

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(arr[j]);
            }
        }
      return list;
    }
     static void swap(int []arr,int firstIndex,int secondIndex){
        int temp= arr[secondIndex];
        arr[secondIndex]= arr[firstIndex];
        arr[firstIndex]=temp;
    }
}
