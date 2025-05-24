/*
Intuition
At each step, I can either take 1 or 2 steps. This means to reach step n, I must have come from either step (n - 1) or step (n - 2). 
So, the total number of distinct ways to reach step n is the sum of the ways to reach steps (n - 1) and (n - 2).
This problem has overlapping subproblems, making it a good fit for recursion with memoization.
*/
/*
Approach
I used recursion with memoization (top-down dynamic programming) to avoid recalculating the number of ways for the same step multiple times. 
I initialized base cases for n = 1 and n = 2. I recursively computed the number of ways for a given step n by 
summing the results of (n - 1) and (n - 2). I stored the result in a HashMap so that I can reuse it in future recursive calls.
This reduces the time complexity from exponential to linear.*/
/*
Complexity
- Time complexity:
O(n).Each value from 1 to n is computed only once and stored in the map.

- Space complexity:
O(n)
*/
//Code:
```java []
class Solution {
    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        memo.put(0,1);
        memo.put(1,1);
        memo.put(2,2);
        return stepCombos(n);
    }

    public int stepCombos(int n){
        if(memo.containsKey(n))
            return memo.get(n);
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        if(!memo.containsKey(n))
            memo.put(n, result);
        return result;
    }
}
```
