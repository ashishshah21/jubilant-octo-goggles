//Problem Given a string, find the length of the longest substring in it with no more than K distinct characters.
//Input: String="araaci", K=2
//Output: 4
//Explanation: The longest substring with no more than '2' distinct characters is "araa".
//Example 2:
//Input: String="araaci", K=1
//Output: 2
//Explanation: The longest substring with no more than '1' distinct characters is "aa".
//Example 3:
//Input: String="cbbebi", K=3
//Output: 5
//Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
//Example 4:
//Input: String="cbbebi", K=10
//Output: 6
//Explanation: The longest substring with no more than '10' distinct characters is "cbbebi".

import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    //iterate over the entire string array
    System.out.println("########## Test case start!!!");
    System.out.println("The value of input string is: " +  str);
    System.out.println("The value of length  is: " +  k);
    int windowend = 1;
    int maxlength = 0;

    for (int windowstart = 0 ; windowstart<str.length(); windowstart++) {
      //for  iteration start, initialize stringunique to first element
      //and start checking every element in uniquestring to the next, 
      String uniquestr = "";
      uniquestr = uniquestr+str.charAt(windowstart);
      System.out.println("The value of string at start of while: " +  uniquestr);
      while (uniquestr.length() <= k && (windowend < str.length()))
      {
        System.out.println("The value of string is: " +  uniquestr);
        System.out.println("The length of string is: " +  uniquestr.length());
        System.out.println("The length of k is: " +  k);
        System.out.println("The value of windowend is: " + windowend);
        //char c = str.charAt(windowend);
        System.out.println("The value of char at windowend is: " + str.charAt(windowend));
        if (uniquestr.contains(String.valueOf(str.charAt(windowend)))) 
        {
          //the character is in uniquestring so increase windowend
   
          windowend++;
          
        }
        
        else 
        {
          
          uniquestr = uniquestr+str.charAt(windowend);
          windowend++;
        }

      } 
      if (maxlength < windowend-1)
        {
          maxlength = windowend-1;
        }
      windowend = 1;  
      System.out.println("The value if maxlength is: " + maxlength);

    }
    // TODO: Write your code here
    System.out.println("########## Test case end!!!");
    return maxlength;


  }
}
