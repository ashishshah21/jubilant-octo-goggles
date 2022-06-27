import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {

    public static List<Integer> findAnagram(String str, String input) {
        int windowStart = 0;
        boolean matchFound = false;
        List<Integer> output = new ArrayList<>();
        Map<Character, Integer> inputMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++ ) {
            char inputChar = input.charAt(i);
            inputMap.put(inputChar, inputMap.getOrDefault(inputChar, 0)+1);
        }

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            targetMap.put(rightChar, targetMap.getOrDefault(rightChar, 0)+1);

            if(windowEnd -windowStart +1 > input.length()) {
                char leftChar = str.charAt(windowStart);
                targetMap.put(leftChar, targetMap.get(leftChar)-1);
                if (targetMap.get(leftChar) == 0 ) {
                    targetMap.remove(leftChar);
                }
             windowStart++;
            }

            if (targetMap.equals(inputMap)) {
             output.add(windowStart);
            }


        }
        return output;
    }
}



