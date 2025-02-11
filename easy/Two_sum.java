//#Two Sum

//Description of challenge: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order

//# Intuition
/*Initially I reasoned that solving this problem would require me to cycle through the values of the nums array 
and add each value with all the remaining values to see find the pair that equates to the target result. */

//# Approach
/* Initially I implemented a brute-force check that iterates over each  value of the nums array and adds it to every other value in the array and checks 
  if each pair is the necessarry pair required to return the target result, ensuring that each of the numbers cannot have the same index. 
  Although this works, the runtime complexity of this solution was O(n^2). 
  I reworked my solution to make it more efficient by instead utilising a HashMap that iterates over each individual 
  int in the array, looks up whether the complement number needed to satisfy the pair is already stored in the HashMap and either returns the 
  indices of the int pair required to add up to target if the condition is satisfied or stores the current index and value of the int being analysed 
  and the loop iterates again until the correct int pair is found.*/

//# Complexity
//- Time complexity:
//The runtime complexity of my first brute-force approach is O(n^2).The runtime complexity of my reworked HashMap check approach is O(n)

//- Space complexity:
/* The space complexity of my initial brute-force approach is O(1) since I had only made use of a few integer variables and an int array of size 2. 
  The space complexity of my reworked HashMap approach is O(n) since it makes use of a HashMap, that in the worst case scenario, 
  stores all the values found within the nums array.*/

//# Code
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] indices = new int[2];

                for(int j = 0; j < nums.length; j++){
                    int complement = target - nums[j];
                    
                    if(map.containsKey(complement)){
                        indices[0] = map.get(complement);
                        indices[1] = j;
                        return indices;
                    }

                    map.put(nums[j], j);
                }

    return indices;
    }
}
