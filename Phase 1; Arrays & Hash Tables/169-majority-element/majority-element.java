class Solution {
            public int majorityElement(int[] nums) {
                int a = (nums.length+1)/2; //Because it's written that 'The majority element is the element that appears more than ⌊n / 2⌋ times.'
                int result=0;
                int c=0;
                for (int i=0; i< nums.length; i++){
                    c=0;
                    for (int j=0; j<nums.length; j++){
                        if(nums[i]==nums[j]){
                            c++;
                        }
                    }
                    if (c>=a){
                        result = nums[i];
                        break;
                    }
                }
                return result;
            }
        }