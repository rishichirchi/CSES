import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TrailingZeros {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pr = new PrintWriter(System.out);

        long n = Long.parseLong(st.nextToken());

        // long res = factorial(n);

        // pr.println(res);
        // long digit;

        // long count = 0;

        // do{
        //     count++;
        //     digit = res%10;
        //     res = res/10;
        // }
        // while(digit == 0);


        // pr.println(count-1);

        long res = n/5;

        pr.println(res);


        pr.close();
    }

    // public static long factorial(long n){
    //     long fact = n;

    //     if(fact == 1){
    //         return fact;
    //     }
    //     return fact*factorial(n-1);
    // }

    
}