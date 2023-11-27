public class LinearSearch {
    public static void main(String[] args) {

        int [] arr={1,3,54,6,7,-5,3,4,3};
        int ans=linearSearch(arr, 34293);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr,int target){
        
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index!=arr.length;index++){

            if(arr[index]==target){
                return index;
            }
        }   

        return -1;
    }
}
