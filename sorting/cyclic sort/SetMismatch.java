import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int [] arr={2,2};
       int[]list= cyclicsort(arr);
       System.out.println(Arrays.toString(list));
    }

     static int [] cyclicsort(int [] arr){
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

      
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
               
                return new int[] {arr[j],j+1};
            }
        }
      return new int[] {};
    }
     static void swap(int []arr,int firstIndex,int secondIndex){
        int temp= arr[secondIndex];
        arr[secondIndex]= arr[firstIndex];
        arr[firstIndex]=temp;
    }
}
