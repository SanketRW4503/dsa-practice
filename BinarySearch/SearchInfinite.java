public class SearchInfinite {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 250, 293, 303, 305 };
        int answer = -1;
        boolean status = false;
        int target =90;
        int start = 0;
        int end = 3;
        while (status != true) {
            if (target <= arr[end]) {

                answer = binarySearch(arr, start, end, target);
                status = true;

            } else {
                start = end+1;
                end = (end+1) * 2;
              
            }
        }
        System.out.println(answer);

    }

    static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
