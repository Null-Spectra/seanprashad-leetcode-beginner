class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum+nums[i];
        }
        int maxSum = windowSum; // This is our starting highest sum

        for (int i = k; i < nums.length; i++) {
            // Add the new number entering on the right: nums[i]
            // Subtract the old number leaving on the left: nums[i - k]
            windowSum = windowSum + nums[i] - nums[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }


        }


        return (double) maxSum / k;
    }
}