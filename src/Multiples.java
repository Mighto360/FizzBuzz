public class Multiples {
    public static void main(String[] args) {
        // prints how many multiples of 3 or 5 there are below 1000
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean multipleThree = i % 3 == 0;
            boolean multipleFive = i % 5 == 0;

            if (multipleThree || multipleFive) {
                count++;
            }
        }
        System.out.println(count);
    }
}
