import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class fruitBasketProblem {

    public static int maxFruits(char[] trees) {
        int windowStart = 0;
        int maxLength = 0;

        Map<Character, Integer> fruitTreeMap = new HashMap<>();
        Map<Character, Integer> subfruitTreeMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < trees.length; windowEnd++ ) {
            char rightTree = trees[windowEnd];
            fruitTreeMap.put(rightTree, fruitTreeMap.getOrDefault(rightTree, 0)+ 1);
            while (fruitTreeMap.size() > 2) {
                char leftTree = trees[windowStart];
                fruitTreeMap.put(leftTree, fruitTreeMap.get(leftTree)-1);
                if (fruitTreeMap.get(leftTree) == 0) {
                    fruitTreeMap.remove(leftTree);
                }
                windowStart++;

            }
            if (maxLength < windowEnd - windowStart +1) {
                subfruitTreeMap.putAll(fruitTreeMap);
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);


        }

        System.out.println("HashMap Keys");
        Set<Character> keys = subfruitTreeMap.keySet();
        for(char key : keys) {
            System.out.println(key);
        }

        System.out.println("HashMap Values");
        Collection<Integer> values = subfruitTreeMap.values();
        for(Integer value : values) {
            System.out.println(value);
        }

        return maxLength;
    }

    public static void main(String args[]) {
        char[] arr = {'A','B','C', 'C', 'B', 'A'};
        System.out.println("The list of fruit types and quantity in each  basket are: " );
        System.out.println("Max number of fruits: " +maxFruits(arr));
    }
}
;