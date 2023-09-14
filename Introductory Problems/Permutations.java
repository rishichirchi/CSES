import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();

        if (n <= 3 && n > 1) {
            System.out.println("NO SOLUTION");
        } else {
            for (long i = 2; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            for (long j = 1; j <= n; j += 2) {
                System.out.print(j + " ");
            }
        }
        scan.close();
    }
}
