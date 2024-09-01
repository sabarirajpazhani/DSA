class Better_Approach {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x= nums[i];
            int y=  target-x;
            if(m.containsKey(y)){
                return new int[]{m.get(y),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}



// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

//LINK: https://leetcode.com/problems/two-sum/description/