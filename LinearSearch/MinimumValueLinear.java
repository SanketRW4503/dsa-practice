// this code will return smallest/minimum number of array using linear search
public class MinimumValueLinear {
    public static void main(String[] args) {

        int[] arr={3,4,5,6,-24,-5,6};
        int result= minimumValue(arr);
        System.out.println(result);
    }

    static int minimumValue(int[] arr){
            int ans=arr[0];
            for(int index=1;index!=arr.length;index++){
                if(arr[index]<ans){
                    ans=arr[index];
                }
            }
            return ans;
    }   
}
