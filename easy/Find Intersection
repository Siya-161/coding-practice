//Challenge Find Intersection: 
//Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: 
//the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). 
//Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.

//My score: 8/10. (5 time period points for submitting solution in 9 minutes. 3 test case points for getting a few test cases wrong).


class Main {

  public static String FindIntersection(String[] strArr) {
    
    ArrayList<String> intersection = new ArrayList<>();

    // Split the input strings and trim any whitespace
    String[] element1 = strArr[0].split(",\\s*");
    String[] element2 = strArr[1].split(",\\s*");

    int l = element2.length;

      for(int i = 0; i < l; i++)
      {
        int j = 0;
        while(j < l)
        {
          if(element1[i].equals(element2[j]))
          {
            intersection.add(element1[i]);
          }
          j++;
        }
      }

      if (intersection.size() > 0) {
      return String.join(",", intersection);
    } else {
      return "false";
    }
  }

  public static void main (String[] args) {
    
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
