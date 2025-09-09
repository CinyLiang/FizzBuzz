package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean divisiblebya = i % a == 0;
            boolean divisiblebyb = i % b == 0;
            if (divisiblebya && divisiblebyb) {
                count += 1;
            } else if (divisiblebya || divisiblebyb) {
                count += 1;
            }
        }
        return count;
    }
}
