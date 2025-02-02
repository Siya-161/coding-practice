//Have the function CodelandUsernameValidation(str) take the str parameter being passed 
//and determine if the string is a valid username according to the following rules:
//1. The username is between 4 and 25 characters.
//2. It must start with a letter.
//3. It can only contain letters, numbers, and the underscore character.
//4. It cannot end with an underscore character.
//Score obtained: 10/10. 5 test case points(All the test case outputs were correct). 5 time period points(The user submitted their solution in 4 minutes)
//Runtime complexit: O(n).

import java.util.*; 
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class Main {

  public static String CodelandUsernameValidation(String str) {
    
  int length = str.length();
  String regex = "^[A-Za-z0-9_]+$"; 
  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(str);
  

  if (length >= 4 && length <= 25)
  {
    if(Character.isAlphabetic(str.charAt(0)))
    {
      if(matcher.matches())
      {
        if (!str.endsWith("_")) 
        {
          str = "true";
        }
        else
        {
          str = "false";
        }

      }
      else
      {
        str = "false";
      }
    }
    else
    {
      str = "false";
    }
  }
  else
  {
    str = "false";
  }  
    

    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }
