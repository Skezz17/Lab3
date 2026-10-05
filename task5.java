import java.util.Scanner;

public class task5 {

    public static int ackermann(int m, int n) {

        if (m == 0) {
            return n + 1;
        }

        if (n == 0) {
            return ackermann(m - 1, 1);
        }

        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(ackermann(m, n));
    }
}