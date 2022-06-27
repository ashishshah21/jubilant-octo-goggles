import java.util.HashMap;
import java.util.Map;

public class longestSubarraywithOnes {

    public static int findlongestsubarray(boolean[] arr, int k) {

        int  windowStart = 0; int maxLength = 0; int maxFrequency = 0;

        Map<Boolean, Integer> boolFrequency = new HashMap<>();

        for (int endWindow = 0; endWindow < arr.length; endWindow++) {
            boolean rightBool = arr[endWindow];

            boolFrequency.put(rightBool, boolFrequency.getOrDefault(rightBool, 0) +1);

            maxFrequency = Math.max(maxFrequency, boolFrequency.get(rightBool));

            if (endWindow - windowStart +1 - maxFrequency > k ) {
                boolean leftbool = arr[windowStart];
                boolFrequency.put(leftbool, boolFrequency.get(leftbool) - 1);
            }

            maxLength = endWindow - windowStart +1 ;


        }

        return maxLength;
    }
}