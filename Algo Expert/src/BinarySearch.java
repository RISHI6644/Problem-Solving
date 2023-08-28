/* Given an array of ascending order sorted integers [0, 1, 21, 33, 45, 45, 61, 71, 72, 73].
    Also a separate integer value known as target will be given. You have to write a function
    which going to find the target's index from the given array.
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        int out = binarySearch(arr, target);

        System.out.println(out);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
