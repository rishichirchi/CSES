import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class NumberSpiral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        
        String s = br.readLine();

        long ans = 0;
        long count = 0;
        char ch = 'A';
        for(char x : s.toCharArray()){
            if(ch == x){
                ++count;
                ans = Math.max(ans, count);
            }
            else{
                ch = x;
                count = 1;
            }
        }

        pr.println(ans);
        
        pr.close();
}
}