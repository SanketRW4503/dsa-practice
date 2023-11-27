public class OrderAgnosticS {

    public static void main(String[] args) {

        // int[] arr = { 1, 3, 5, 7, 9, 12, 24, 43};
        int[] arr = { 33,22,20,10,8,5,4,3,1,-2,-22};

        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
  

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if(target>arr[mid]){
                    end=mid-1;
                    
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;

    }
}
