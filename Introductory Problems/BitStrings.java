import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class BitStrings {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pr = new PrintWriter(System.out);
        
        int n = Integer.parseInt(st.nextToken());
        final int mod = (int)1e9+7;
        long res = 1;
        for(int i = 0; i < n; i++){
            res = res*2%mod;
        }
        pr.print(res);
        pr.close();
}
}