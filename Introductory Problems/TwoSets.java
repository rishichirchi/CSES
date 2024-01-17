import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TwoSets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pr = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int i = 1;

        int sum = (n * (n + 1)) / 2;

        if (sum % 2 == 0) {
            if (n % 2 != 0) {
                while (i <= n) {
                    for (int j = 0; j < 2; j++) {
                        a.add(i++);
                    }
                    if (i <= n) {
                        b.add(i++);
                    }
                    if (i <= n) {
                        a.add(i++);
                    }

                    if (i <= n) {
                        for (int j = 0; j < 2; j++) {
                            b.add(i++);
                        }
                    }

                    if (i <= n) {
                        a.add(i++);
                    }
                    if (i <= n) {
                        b.add(i++);
                    }
                }
            }
            else{
                int k = n;
                for(int j = 1 ; j<= n/2; j += 2){
                    a.add(j);
                    a.add(k);

                    b.add(j+1);
                    b.add(k-1);

                    k -=2;
                }
            }

            int sum1 = 0;
            int sum2 = 0;

            for (int x : a) {
                sum1 += x;
            }
            for (int x : b) {
                sum2 += x;
            }
            // for (int x : a) {
            // pr.print(x + " ");
            // }
            // for (int x : b) {
            // pr.print(x + " ");
            // }

            if (sum1 == sum2) {
                pr.println("YES");
                pr.println(a.size());
                for (int x : a) {
                    pr.print(x + " ");
                }
                pr.println();

                pr.println(b.size());
                for (int x : b) {
                    pr.print(x + " ");
                }
            } else {
                pr.println("NO");
            }

        } else

        {
            pr.println("NO");
        }

        pr.close();
    }
}