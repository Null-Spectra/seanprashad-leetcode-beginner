class Solution {
            public double findMaxAverage(int[] nums, int k) {


                int maxsum,sum=0;
                for (int i=0; i< k; i++){
                    sum=sum+nums[i];
                }
                maxsum=sum;

                for (int i=0; i<nums.length-k; i++){
                    sum=sum-nums[i]+nums[k+i];

                    if (sum>maxsum){
                        maxsum=sum;
                    }

                }


                return (double)maxsum/k;

            }
        }
