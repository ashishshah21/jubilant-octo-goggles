import java.util.HashMap;
import java.util.Map;

public class maxReplaceString {

    public static int maxReplaceSubstring(String str, int k) {

        int windowStart = 0; int maxFrequency = 0; int maxLength = 0;

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0)+1);

            maxFrequency = Math.max(maxFrequency, charFrequencyMap.get(rightChar));

            if (windowEnd - windowStart +1 - maxFrequency > k)
            {
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) -1 );
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }

        return maxLength;

    }

    public static void main(String[] args) {


        System.out.println(maxReplaceSubstring("aabccbb", 2));
        System.out.println(maxReplaceSubstring("abbcb", 1));
        System.out.println(maxReplaceSubstring("abccde", 1));

    }

}
