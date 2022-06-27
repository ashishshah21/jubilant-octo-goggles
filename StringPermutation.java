import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

    public static boolean findPerumation(String str, String input) {

            int windowStart = 0 ; boolean matchFound = false;

            Map<Character, Integer>  permutationMap = new HashMap<>();
            Map<Character, Integer>  targetMap = new HashMap<>();

            for (int i = 0; i < input.length(); i++) {
                char inputChar = input.charAt(i);
                permutationMap.put(inputChar, permutationMap.getOrDefault(inputChar, 0) + 1);
            }

            for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
                char rightChar = str.charAt(windowEnd);
                targetMap.put(rightChar, targetMap.getOrDefault(rightChar, 0)+1);

                if (windowEnd - windowStart +1  > input.length()) {
                    char leftchar = str.charAt(windowStart);
                    targetMap.put(leftchar, targetMap.get(leftchar) - 1);
                    if (targetMap.get(leftchar) == 0) {
                        targetMap.remove(leftchar);
                    }
                    windowStart++;
                 //compare maps
                }

                 matchFound =  matchFound || targetMap.equals(permutationMap);

            }

            return matchFound;



    }
}
