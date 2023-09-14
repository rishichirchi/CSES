import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Permutations {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        long n = Integer.parseInt(br.readLine());

        if (n <= 3 && n > 1) {
            System.out.println("NO SOLUTION");
        } else {
            for (long i = 2; i <= n; i += 2) {
                pr.print(i + " ");
            }
            for (long j = 1; j <= n; j += 2) {
                pr.print(j + " ");
            }
        }
        pr.close();
    }
}
