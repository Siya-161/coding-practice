/*
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
*/

/*Intuition
Initially I determined that iterating through the array and adopting a greedy approach by seeing which number 
takes me the furthest as I iterate through the array would be the most straightforward first step to take. 
This involved having a variable called max(initialised to 0) that will store the furthest index I can reach in the array as I iterate. 
My first approach involved using max and another variable: oldMax (this one would store the previous max index I can reach in the 
array if max were to be updated as I iterate). Throughout each iteration in the array I would have an if statement that would compare max 
and oldMax and if they were not the same I would incremement count by 1. This solution ran into issues with a few test cases and had to be reworked.*/

/*Approach
The approach I settled on makes use of the following variables: max(an int initialised to 0 that stores the furthest point I can reach in the array),
count(an int initialised to 0 that tracks the number of jumps perfomed), currentJumpEnd (an int initialised to 0 that tracks the furthest reachable index 
within the range of indexes I can jump to from the current number). This approach works by iterating through the array in a for loop, 
checking if the length of nums is not just 1 digit(if this condition is true count is set to 0 and the loop breaks). 
Setting max to the larger value between the value of max itself or the sum of the current index and its value. 
If the current index is equal to currentJumpEnd, count increments by 1 and currentJumpEnd is set to the current value of max. 
If at any point currentJumpEnd is greater than or equal to the final index the loop breaks and the final value of count is returned.*/

/*Complexity
Time complexity:
O(n)

Space complexity:
O(1)*/

Code
class Solution {
    public int jump(int[] nums) {

         int max = 0; 
         int count = 0; 
         int currentJumpEnd = 0;
        
         for(int i = 0; i < nums.length -1; i++){
                if(nums.length == 1){
                    count = 0;
                    break;
                }
                int j = nums[i];
                max  = Math.max(max, i + j);
                if(i == currentJumpEnd){
                    count++;
                    currentJumpEnd = max;
                }
                
                if(currentJumpEnd >= nums.length - 1){
                    break;
                }
            }

            return count;

        
    }
}
