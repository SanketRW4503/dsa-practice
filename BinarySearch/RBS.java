public class RBS {
    public static void main(String[] args) {

        int[] arr = {6,7,1,2,3,4,5};
        int target = 6;
        int pivot = findPivot(arr);
        int ans=-1;
        if(pivot==-1){
          ans=  binarySearch(arr, target, 0, arr.length-1);
    
        }else if (arr[0]<=target){
            ans= binarySearch(arr, target, 0, pivot);
            
        }else{
            ans= binarySearch(arr, target, pivot+1, arr.length-1);
        }
        
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

       
//  int[] arr = {6,7,1,2,3,4,5};

        while (start <=end) {
 
            int mid = start + (end - start) / 2;
            System.out.println("p"+mid);
            // case 1
            if (mid<end &&arr[mid] > arr[mid + 1]) {
                          

                return mid;
            }
            // case 2
            if (mid>start && arr[mid] < arr[mid - 1]) {
               

                return mid - 1;
                           
            }

            // case 3
            if (arr[mid] <= arr[start]) {
          
                end = mid - 1;
            }else {
                  

                start = mid + 1;
            }

        }

        return -1;

    }
}
