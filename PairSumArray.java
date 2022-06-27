import java.util.Arrays;

public class PairSumArray {

    public static int[] pairSum (int [] arr, int targetSum) {

        int [] matches = new int[] { -1, -1};
        int start = 0; int end = arr.length -1;

        for (int i = 0; i < arr.length -1 ; i++) {
            int sum = arr[start] + arr[end];
            if (sum == targetSum )
                return new int[] {start, end};
            if (sum > targetSum)
                end--;
            else
                start++;
        }

        return matches;


    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairSum(new int[] {2,7,10, 19,21}, 20)));
    }
}
