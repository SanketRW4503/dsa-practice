public class IsSorted {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,7};
        System.out.println(isSorted(arr));
    }
    static int counter=0;
    static boolean isSorted(int[] arr){
        if(counter==arr.length-1){
            return true;
        }
        if(arr[counter]<arr[counter+1]){
            counter++;
            return isSorted(arr);
        }

        return false;
        

    }
}
