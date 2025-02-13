/*Challenge: Given an integer x, return true if x is a 
palindrome, and false otherwise.*/

Link to solution: https://leetcode.com/problems/palindrome-number/solutions/6417882/palindrome-number-solution-by-siya105-q3bx

// Intuition
/*Initially, I attempted to extract and store each digit in an array to reconstruct the reversed number, 
but this added unnecessary complexity. 
I realized that reversing the number directly while iterating would be more efficient. */

// Approach
/* 
1. Handle negatives early – Immediately return false for x < 0 since negative numbers can’t be palindromes.
2. Reverse the number efficiently – Extract digits one by one using % 10 and build the reversed number without extra space.
3.Compare original and reversed values – If they match, return true; otherwise, return false. */

// Complexity
//- Time complexity:
/* Time complexity: O(log n) – Since we extract digits one by one, the number of iterations is proportional to the number of digits */

//- Space complexity:
/* O(1) – No additional data structures are used, just a few integer variables. */

// Code
```java []

class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        else if (x == reversedNumber(x)) {
            return true;
        }
        else {
            return false;
        }


    }

    public static int reversedNumber(int num) {
    int result = 0;
    int remainder = 0;

   while(num > 0) {
        remainder = num % 10;
        result = result * 10 + remainder; 
        num = num/10;
    }
    return result;
}
}
```
