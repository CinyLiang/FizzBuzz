package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;
            if (divisibleby3 && divisibleby5) {
                n += 1;
            } else if (divisibleby3 || divisibleby5) {
                n += 1;
            }
        }
        System.out.println(n);
    }
}
