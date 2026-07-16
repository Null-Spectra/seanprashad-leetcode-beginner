class Solution {
            public int missingNumber(int[] nums) {
                int resuts=nums.length;
                Arrays.sort(nums);
                for(int i=0; i<nums.length; i++){
                    if(i!=nums[i]){
                        resuts=i;
                        break;
                    }
                }
                return resuts;
            }

        }