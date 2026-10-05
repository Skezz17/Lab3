import java.util.Scanner;

public class task2 {

    public static double factorialLog(int n) {
        if (n == 1) {
            return 0;
        }

        return Math.log(n) + factorialLog(n - 1);
    }

    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double result = factorialLog(n);

        System.out.println(result);
    }
}