public class LongestSubarrayWithSumAtMostK {
    public static int longestSubarrayWithSumAtMostK(int[] arr, int k) {
        int start = 0;
        int currentSum = 0;
        int maxLength = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > k && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum <= k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        System.out.println(longestSubarrayWithSumAtMostK(arr, k)); // Output: 5
    }
}
