import java.util.HashMap;
import java.util.Map;

public class norepeatSubString {

    public static int maxNorepeat(String str) {

        int windowstart = 0; int maxvalue = 0;

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int windowsend = 0; windowsend < str.length(); windowsend++) {
            char rightChar = str.charAt(windowsend);
            if (charFrequency.containsKey(rightChar)) {
                windowstart = Math.max(windowstart, charFrequency.get(rightChar) + 1);
            }
            charFrequency.put(rightChar, windowsend);

            maxvalue = Math.max(maxvalue, windowsend - windowstart +1);

            }

        return maxvalue;

    }

    public static void main(String[] arg) {
        System.out.println("The unique string is "+ maxNorepeat("abccde"));
    }
}
