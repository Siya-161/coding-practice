//Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. 
//For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. 
//For the test cases, the range will be between 1 and 18 and the input will always be an integer.

//Score: 10/10. 5 test case points (all test case outputs wrere correct) + 5 time period points (Solution was submitted in 4 minutes)
//Runtime complexity: O(n).

import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    
    for(int i = (num-1); i >= 1; i--)
    {
      num = num * i;
    }


    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}
