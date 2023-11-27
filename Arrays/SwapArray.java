import java.util.Arrays;

public class SwapArray {
 
    public static void main(String[] args) {
        
        int [] arr= {1,3,2,4,5,3};
        System.out.println(Arrays.toString(arr));

        swap(arr,0,1);
        
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int []arr,int index1,int index2){
        int temp= arr[index2];
        arr[index2]= arr[index1];
        arr[index1]=temp;
    }
}
