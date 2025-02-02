//Question: Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. 
//If there are two or more words that are the same length, return the first word from the string with that length. 
//Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"
//Score: 7/10. 5 test case points (All the test case outputs were correct) and 2 time period points (This user submitted their solution in 20 minutes).
//Runtime complexity: O(n).

import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) {

   ArrayList<String> words = new ArrayList<>();
    StringBuilder word = new StringBuilder();

    
    for (int j = 0; j < sen.length(); j++) {
      char ch = sen.charAt(j);

      if (Character.isLetterOrDigit(ch)) {
        word.append(ch); 
      } else if (word.length() > 0) {
        words.add(word.toString()); 
        word.setLength(0); 
      }
    }

    
    if (word.length() > 0) {
      words.add(word.toString());
    }

   
    String longest = "";
    for (String w : words) {
      if (w.length() > longest.length()) {
        longest = w;
      }
    }  
      
    
      
    return longest;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
