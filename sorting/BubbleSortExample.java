import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        
        int [] arr= {4,5,3,2,1};
        boolean swap=false;
        for(int count=0;count !=arr.length-1;count++){
            swap=false;
            for(int j=0;j!=arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                // swap the values
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swap=true;
            }

        }
                if(swap==false){
                    break;
                }

        }

                System.out.println(Arrays.toString(arr));

    }
}
