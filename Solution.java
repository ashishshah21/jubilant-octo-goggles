import java.util.Stack;

public class Solution {

    public static int gcd(int num1, int num2) {

        if (num1 == num2)
            return num1;
        else if (num1 > num2)
            return gcd(num1-num2, num2);
        else
            return gcd(num1, num2-num1);


    }


    public static String reverseString(String myStr) {


        //Base Case
        if (myStr.isEmpty()) {
            return myStr;
        }

        //recursive case

        else {
            return reverseString(myStr.substring(1)) + myStr.charAt(0);
        }

    }

    public static String remDuplicates(String text) {
        if (text.length() == 1) {
            return text;
        }

        if (text.substring(0,1).equals(text.substring(1,2))) {
            return remDuplicates(text.substring(1));
        }
        else {
            return text.substring(0,1) + remDuplicates(text.substring(1));
        }


    }


    public static void strPermutations(char[] array, int length) {

        if (length == 1) {
            System.out.println(array);
            return;
        } else {
            for(int i = 0; i < length; i++) {
                arrayswap(array, i, length - 1);
                strPermutations(array, length - 1);
                arrayswap(array, i, length - 1);
            }
        }



    }

     public static void arrayswap(char[] array, int i, int j) {

            char c;
            c = array[i];
            array[i] = array[j];
            array[j] = c;

        }

    public static void arrayswap(int[] array, int i, int j) {

        int c;
        c = array[i];
        array[i] = array[j];
        array[j] = c;

    }


    public static int firstoccurance(int[] array, int num) {
          for (int i = 0; i < array.length; i++) {
              if (array[i] == num) {
                  return i;
              }
          }
          return -1;
      }

      public static int firstOccuranceRec(int[] array, int num, int currentIndex) {
          //base case

          if (array.length == currentIndex) {
              return -1;

          } else if (array[currentIndex] == num) {
              return currentIndex;
          } else {
              return firstOccuranceRec(array, num, currentIndex);
          }
      }


      public static int[] inverseArray(int[] inarray, int beginIndex, int endIndex) {
              //base case
              if (endIndex%2 == 0 && beginIndex == endIndex) {//odd number of elements in the array
                      return inarray;

              } else if (beginIndex == (endIndex-1)/2) { // odd number of elements in the array
                      arrayswap(inarray, beginIndex,endIndex);
                      return inarray;
                  }
              //recursive case
               arrayswap(inarray, beginIndex,endIndex);
               return inverseArray(inarray, beginIndex+1, endIndex-1);
      }


      public static int[] sortArray(int[] sarray, int currIndex) {
          //base case  {
          if (currIndex == sarray.length-1 ) {
          return sarray;
      }
       //find lowest number and swap with current position
       int lowIndex;
       for (int i = currIndex;  i < sarray.length- 1; i++) {
           if (sarray[currIndex] < sarray[i + 1])
               continue;
           else {
               arrayswap(sarray, currIndex, i+1);
           }
       }
        return sortArray(sarray, currIndex+1) ;




      }





}