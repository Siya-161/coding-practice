//Challenge: Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly matched and each one is accounted for. 
//Otherwise return 0. For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up. 
//Only "(" and ")" will be used as brackets. If str contains no brackets return 1.

//Score: 9/10. 5 test case points(All the test case outputs were correct) and 4 time period points (This user submitted their solution in 18 minutes)
//Runtime complexity: O(n)

import java.util.*; 
import java.io.*;

class Main {

  public static String BracketMatcher(String str) {
   
   Stack<String> bracketStack = new Stack<>();

   for(int i = 0; i < str.length(); i++)
   {
     char c = str.charAt(i);
    String check;

     String ch = Character.toString(c);

     if(ch.equals("("))
     {
       bracketStack.push(ch);
     }

   
    else if(ch.equals(")"))
     {
       if(bracketStack.isEmpty())
       {
         bracketStack.push(")");
       }
       else 
       {
         bracketStack.pop();
       }
     }
   }

  if(bracketStack.isEmpty())
  {
    str = "1";
  }
  else{
    str = "0";
  }

    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s.nextLine())); 
  }

}
