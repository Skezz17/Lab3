import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        int newSize = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                newSize++;
            }
        }

        int[] result = new int[newSize];

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                result[j] = a[i];
                j++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}