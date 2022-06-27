import java.util.*;

class WordConcatenation {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        System.out.println("################# STARTING ##############");
        System.out.println("Input String is: " + str);
        System.out.println("Compare String array is: " + Arrays.toString(words));
        List<Integer> resultIndices = new ArrayList<Integer>();
        int windowStart = 0; int windowEnd =0; int matched = 0;
        Map<String, Integer> wordMap = new HashMap<>();

        for(int i =0; i < words.length; i++) {
            String nextWord = words[i];
            System.out.println("Adding to Hashmap, word is :"+nextWord);
            wordMap.put(nextWord, wordMap.getOrDefault(nextWord,0)+1 );
        }
        while(windowStart < str.length()-1) {
            for(int i =0; i < words.length; i++) {
                // windowEnd = windowEnd + words[i].length();
                System.out.println("String Length is: " + str.length() +"; Window End is: " + (windowEnd +words[i].length()));
                if (windowEnd +words[i].length() <= str.length()) {
                    String subStr = str.substring(windowEnd,windowEnd+words[i].length());
                    System.out.println("String to be matched is: "+ subStr +"; WindowStart location : " + windowStart+"; WindowEnd location : " + windowEnd);
                    if (wordMap.containsKey(subStr)) {
                        System.out.println("##########The map contains the key: ###########" + subStr );
                        if (wordMap.get(subStr)>0) {
                            System.out.println("Matched key: " + subStr + "; Matched Value: " + wordMap.get(subStr) +"Matched string is: "+ subStr +"; At location: " + windowEnd);
                            matched++;
                            System.out.println("Matched counter is: "+ matched);

                            windowEnd = windowEnd + words[i].length();
                            System.out.println("New windowEnd  is: "+ windowEnd);

                            wordMap.put(subStr, wordMap.get(subStr)-1);
                        }
                        else {
                            wordMap.put(subStr, wordMap.get(subStr)+1);
                        }
                    } else {
                        windowEnd = windowStart;
                    }
                }
                if (matched == words.length) {
                    System.out.println("Match Found. Location: " +windowStart);
                    resultIndices.add(windowStart);

                }

            }
            System.out.println("For loop complete. Incrementing windowstart");
            windowStart++;
            windowEnd = windowStart;
            matched = 0;
            wordMap.clear();
            for(int j =0; j < words.length; j++) {
                String nextWord1 = words[j];
                wordMap.put(nextWord1, wordMap.getOrDefault(nextWord1,0)+1 );
            }


            // TODO: Write your code here

        }
        return resultIndices;
    }

    public static void main(String[] args) {

        System.out.println("@#@#@#@#@@#the output is@#@#@#@#@@#@#" + findWordConcatenation("catoxdogoxdeerdog", new String[] { "deer", "ox" }));
        System.out.println("the output is" + findWordConcatenation("catcatfoxfox", new String[] { "cat", "fox" }));
    }
}
