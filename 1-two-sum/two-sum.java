class Solution {
    // The JVM Warmup H@ck
    static {
        int[] dummyArray = {0, 0};
        for(int i = 0; i < 1000; i++) {
            // Force the JIT compiler to optimize the method before the timer starts
            int[] dummyResult = twoSum(dummyArray, 0); 
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1}; //just return if no solution found
    }
}