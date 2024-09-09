public class Reduce {
    public static void main(String[] args) {
        /*
        Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
        For example, if you start with n = 2, the answer is 2. Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.
         */
        int n = 100;
        int stepCount = 0;
        while (n > 0) {
            boolean isEven = n % 2 == 0;
            if (isEven) {
                n /= 2;
            } else {
                n -= 1;
            }
            stepCount ++;
        }
        System.out.println(stepCount);
    }
}
