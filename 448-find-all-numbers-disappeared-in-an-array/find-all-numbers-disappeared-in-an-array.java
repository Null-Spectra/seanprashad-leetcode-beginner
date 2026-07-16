class Solution {
            public List<Integer> findDisappearedNumbers(int[] nums) {
                List<Integer> result = new ArrayList<>();
                int[] exists = new int[nums.length+1];
                // We allocated +1, because We want to track from 1 instead of 0. so nums[8], We needed exist[9];
                // so, exists[0]=0 always remain this;
                for(int i: nums){
                    exists[i]++ ; // for example, here if nums[..]=8, becomes exists[8]=1;
                                  // if any numbers does not exists = 0(this is most important), once exists = 1, two times =2, keeps going... 
                }

                for(int i=1; i< nums.length+1; i++){ //we are skipping exists[0]=0;
                    if (exists[i]==0){
                        result.add(i);
                    }
                }

                return result;
            }
        }