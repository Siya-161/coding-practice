/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
*/

/* 
Intuition:
Initially, I thought I could check if each character in the ransomNote existed in the magazine by simply storing character 
positions or values using a HashMap. 
I assumed checking presence and removing matched characters would suffice.

Approach:
My first approach incorrectly mapped positions to characters, which didn’t account for duplicate letters and mismatched indices. 
I then transitioned to using two HashMaps to store character frequencies for ransomNote and magazine. 
I iterated through each required character and compared its needed frequency with what's available. 
After realising that assigning boolean flags in a loop was logically risky, 
I refined the solution to immediately return false on failure cases and return true only if all requirements were satisfied.

Complexity
Time complexity:
O(n + m)

Space complexity:
O(K) or O(1)

Code:
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(char c : ransomNote.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(char c : magazine.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(char c : map1.keySet()){
            if(!map2.containsKey(c))
                return false;
            else if(map2.get(c) < map1.get(c))
                return false;
        }

        return true;

    }

