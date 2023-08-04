/* Given an array of distinct integers means no number will be repeated [3, 5, -4, 8, 11, 1, -1, 6]. Also a separate
    integer value known as target will be given. You have to write a function which going to find a pair from the given
    array that sums up the target.
 */

// This is the brute force approach.
public class TwoNumberSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;

        twoSum(arr, target);
    }

    public static void twoSum(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = temp + arr[j];
                if(sum == target) {
                    System.out.println(temp);
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}

/*
    Time Complexity: The time complexity of the code is determined by the two nested loops in the twoSum method.
     The outer loop runs from i = 0 to i = arr.length - 1, and the inner loop runs from j = i + 1 to j = arr.length - 1.
     In the worst case, both loops will iterate over all elements in the array. So, the time complexity can be
     approximated as O(n^2), where n is the size of the input array.

    Space Complexity: The space complexity of the code is relatively low. It uses a constant amount of extra space
     for the sum and temp variables, which are independent of the input size. Additionally, it uses the arr array,
     but since this is an input parameter, we don't consider it as part of the space complexity. Therefore, the space
     complexity is O(1), constant space.
 */