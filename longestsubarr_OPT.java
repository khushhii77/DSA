import java.util.Arrays;
import java.util.HashMap;

public class longestsubarr_OPT {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 4, 1, 1, 7};
        int k = 9;
        System.out.println(Arrays.toString(longestSubarray(arr, k)));
    }

    public static int[] longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int start_index = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If subarray from 0 to i sums to k
            if (sum == k) {
                maxLen = i + 1;
                start_index = 0;
            }

            // If (sum - k) seen before
            if (map.containsKey(sum - k)) {
                int prev_index = map.get(sum - k);
                int length = i - prev_index;
                if (length > maxLen) {
                    maxLen = length;
                    start_index = prev_index + 1;
                }
            }

            // ****Store sum in map only if not already present
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        if (start_index == -1) return new int[0]; // no subarray found

        int[] res = new int[maxLen];
        for (int i = 0; i < maxLen; i++) {
            res[i] = nums[start_index + i];
        }
        return res;
    }
}
