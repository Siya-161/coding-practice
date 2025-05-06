/* Problem Description:
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.*/

/* Intuition
Upon understanding the problem I decided to make use of a hashmap as my primary data structure where I store each of the different roman numeral characters and their corresponding values. 
I then decided to convert the given roman numeral string into a character array and iterate through each of the characters and adding their values to "sum" - an int variable that stores the total value of the string. */

/*Approach
My approach involves: creating a hashmap and storing each of the roman numeral characters and their corresponding values in the hashmap. 
Converting the roman numeral string into a character array so I can iterate over each of the characters in the string from left to right using a for loop and retrieve the value of each character by looking the character up in the hashmap. 
For the six special instances where subtraction is used to determine the value of a pair of characters (i.e IV = 5-1) I made use of nested if and switch statements inside my loop where I first check if the current character is one of the 3 characters (I, X or C) 
that can be placed before the corresponding characters that indicate when we are meant to make use of subtraction to determine the value of the pair of characters and secondly, I check whether the current character is not the final character in the char array. If these two conditions are met, 
switch statements inside the loop add the appropriate value of the pair of character to "sum" and the loop skips the next character in the array so that no characters are counted twice.*/

/*Complexity
Time complexity:
O(n)

Space complexity:
O(n)*/

//Code:
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbols = new HashMap<Character, Integer>();

        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        char[] numerals = s.toCharArray();
        int sum = 0;

        for(int i = 0; i < numerals.length; i++)
        {
            if(numerals[i] == 'I' && i != numerals.length - 1)
            {
                switch(numerals[i + 1])
                {
                    case 'V':
                        sum += 4;
                        i++;
                        continue;
                    case 'X':
                        sum += 9;
                        i++;
                        continue;
                }
                
            }

            if(numerals[i] == 'X' && i != numerals.length - 1)
            {
                switch(numerals[i + 1])
                {
                    case 'L':
                        sum += 40;
                        i++;
                        continue;
                    case 'C':
                        sum += 90;
                        i++;
                        continue;
                }
                
            }

            if(numerals[i] == 'C' && i != numerals.length - 1)
            {
                switch(numerals[i + 1])
                {
                    case 'D':
                        sum += 400;
                        i++;
                        continue;
                    case 'M':
                        sum += 900;
                        i++;
                        continue;
                }
                
            }

            

            sum += symbols.get(numerals[i]);
        }

        return sum;

    }
}
