//https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumber {

    public static void main(String[] args) {
        int []arr={3,1,3,4,2};
        
        int ans=cyclicsort(arr);
        System.out.println(ans);

        

    }
    static int cyclicsort(int [] arr){
    int i=0;
        while (i<arr.length) {
            
            if(arr[i]!=i+1){
                int correct= arr[i]-1;
                if(arr[i]!=arr[correct]){    
                
                    swap(arr, i, correct);
                
                 }else{
               
                    return arr[i];
            }
            }else{
                i++;
            }
        }
        return-1;
    }
     static void swap(int []arr,int firstIndex,int secondIndex){
        int temp= arr[secondIndex];
        arr[secondIndex]= arr[firstIndex];
        arr[firstIndex]=temp;
    }
}
