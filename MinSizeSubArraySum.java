//Given an array of positive integers and a number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.

//Example 1:

//Input: [2, 1, 5, 2, 3, 2], S=7
//Output: 2
//Explanation: The smallest subarray with a sum greater than or equal to ‘7’ is [5, 2].


class MinSizeSubArraySum {
  public static int findMinSubArray(int S, int[] arr) {
    // TODO: Write your code here
    //look at one element at a time else look at 2 elements ....till you look at arr.length() at a time
    int startwindow = 0;
    int endwindow = 0;
    int windowsum = 0;
    int initialsum = 0;
    //initially startwindow = 0 and end window = 0 ; then 0 -1 ; 0-2...1-1, 1-2...
    for (int windowlength = 0; windowlength < arr.length; windowlength++) {
      initialsum = initialsum + arr[windowlength];
      windowsum = initialsum;
      for ( startwindow = 0; startwindow < arr.length - windowlength -1 ; startwindow++) {
        endwindow = startwindow+windowlength+1;
        windowsum = windowsum + arr[endwindow] - arr[startwindow];
        if (windowsum >= S) { 
           return (endwindow-startwindow);
        }
                                                                                        
    
       } 
    }
       return 0;
  }
}
