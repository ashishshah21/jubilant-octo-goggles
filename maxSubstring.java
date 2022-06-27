import java.util.HashMap;
import java.util.Map;


public class maxSubstring {

    public static int findMax(String str, int k) {

        int windowStart = 0;
        int maxLength = 0;
        String substr = "";
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar,0) +1);
            while(charFrequencyMap.size() > k) {
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar)-1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }
            //save the substring
            if (maxLength < windowEnd - windowStart +1) {
                 substr = str.substring(windowStart, windowEnd+1);
            }
            maxLength = Math.max(maxLength,  windowEnd - windowStart +1 );


        }

        System.out.println(substr);
        return maxLength;

    }

    public static void main(String[] args) {

        System.out.println("The max length for araaca:" + findMax("araaci", 2));
        System.out.println("The max length for araaca:" + findMax("araaci", 1));
        System.out.println("The max length for asdfwerasdfasfdadfuuuuerewererasdfqwewewqeqweqwerqwerrqwerwqewqerq: " +
                findMax("asdfwerasdfasfdadfuuuuerewererasdfqwewewqeqweqwerqwerrqwerwqewqerq", 5));

    }
}
