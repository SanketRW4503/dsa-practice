public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 34, 5, 56, 6, 4 };

        System.out.println(findIndex(arr, 34, 0));
    }

    static int findIndex(int[] arr, int target, int index) {

        if (index == arr.length - 1 && arr[index] != target) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
           return  findIndex(arr, target, index + 1);
        }

    }
}
