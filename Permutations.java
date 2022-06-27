import java.util.Arrays;

public class Permutations {

    private boolean[] used;
    private StringBuilder out = new StringBuilder();
    private final String in;

    public Permutations ( final String str) {
        in = str;
        used = new boolean[in.length() ];

    }

    public void permute() {
        if (out.length() == in.length() ) {
            System.out.println(out);
            return;
        }
        System.out.println("Entering For: " );
        for (int i = 0; i < in.length(); ++i) {
            if (used [i] ) continue;
            System.out.println("value of used is : " + Arrays.toString(used));
            System.out.println("i : " + i);
            System.out.println("value of out before append is : " + out);
            out.append(in.charAt(i));
            System.out.println("value of out after append is : " + out);
            used[i] = true;
            System.out.println("value of used after append is : " + Arrays.toString(used));
            System.out.println("Entering new Permute");
            permute();
            System.out.println("Returned from previous Permute");
            System.out.println("value of used after returning from Permute is : " + Arrays.toString(used));
            System.out.println("Setting used to false");
            used[i] = false;
            System.out.println("value of used after after setting to false is : " + Arrays.toString(used));
            System.out.println("Setlength for out");
            out.setLength(out.length() -1);
            System.out.println("value of out after setlength is : " + out);
            System.out.println("End of iteration, i : " + i);


        }
    }
}
