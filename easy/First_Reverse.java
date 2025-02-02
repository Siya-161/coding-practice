//Question: Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
//For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.
//Score: 8/10 points. 5 test case points (All the test case outputs were correct) and 3 time period points (this user submitted their solution in 11 minutes).
//Runtime complexity: O(n)

import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    
    int stringSize = str.length();
    
    char[] charArray = new char[stringSize];

    for(int i = 0; i < stringSize; i++ )
    {
      charArray[i] = str.charAt(stringSize - (i+1));
    }

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < charArray.length; i++)
    {
        sb.append(charArray[i]);
    }

    str = sb.toString();
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}
