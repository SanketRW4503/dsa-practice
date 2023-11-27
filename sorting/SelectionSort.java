import java.util.Arrays;

public class SelectionSort{

    public static void main(String[] args) {
        int [] arr={5,3,5553,2,-12,1,0};
        
        for(int i=0;i!=arr.length-1;i++){

            int last = arr.length-i-1;
            int maxNumberIndex= getMaxNumber(arr,0,last);
            int temp=arr[last];
            arr[last]=arr[maxNumberIndex];
            arr[maxNumberIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    static int getMaxNumber(int []arr,int start,int end){
        int maxnumber=0;
        int index=0;
        for(int i=0;i!=end+1;i++){
          
            if(arr[i]>maxnumber){
                maxnumber=arr[i];
                index=i;
            }
        }

        return index;

    }

}