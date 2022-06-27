public class FibbonacciClass {

    public  int fibonacci(int n) {
        //Base Case
        if (n <= 1) {
            return n;
        }

        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }


    }
}
