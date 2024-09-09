package src;

public class Multiples {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (multiples(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean multiples(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        return divisibleBy3 || divisibleBy5;
    }
}
