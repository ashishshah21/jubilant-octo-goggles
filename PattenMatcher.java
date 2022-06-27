import java.util.HashMap;
import java.util.Map;

public class PattenMatcher {

    public static int patternFinder(String str, String input) {
        int windowStart = 0; int minLength =0;
        String substr = new String("");
        Map<Character, Integer> inputPattern = new HashMap<>();
        Map<Character, Integer> matchedChars = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            inputPattern.put(inputChar, inputPattern.getOrDefault(inputChar, 0) + 1);
        }

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (inputPattern.containsKey(rightChar)) {
                matchedChars.put(rightChar, matchedChars.getOrDefault(rightChar, 0) + 1);
            }
            if (windowEnd - windowStart + 1 > input.length()) {
                substr = str.substring(windowStart, windowEnd + 1);
                // minLength = Math.min(minLength, windowEnd - windowStart +1);
                char leftChar = str.charAt(windowStart);
                matchedChars.put(leftChar, matchedChars.get(leftChar) - 1);
                if (matchedChars.get(leftChar) == 0) {
                    matchedChars.remove(leftChar);
                }
                windowStart++;

            }
        }

        return minLength;
    }
}
