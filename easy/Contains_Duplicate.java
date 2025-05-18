/*
Problem:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

/*
Intuition
After understanding the problem I realsied that I had to: iterate through the given array, check if the current number is present in the hashmap, 
if it is - return true, 
if not - store the current number and its index in the hashmap. If no duplicates are found, return false.
*/

/*
Approach
I created an uninitialised hashmap and a boolean variable set to false by default. I used a for loop to iterate through the given array, 
determining whether the current value in the loop already appeared in the array by checking to see if it is present in the hashmap. 
If the value is present in the hashmap I set bool to true and return bool. If the value is not present in the hashmap I store the current number 
and its index in the hashmap and the loop moves on to the next index.
*/

/*
Complexity
Time complexity:
O(n)

Space complexity:
O(n)

Code:
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean bool = false;

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                bool = true;
                return bool;
            }

            map.put(nums[i], i);
        }

        return bool;
    }
}
