import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n ; i++) {
            a[i] = scan.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {

            while (a[i] > a[i + 1]) {
                a[i + 1] += 1;
                count++;
            }
        }

        System.out.println(count);
        scan.close();
    }
}
