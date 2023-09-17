import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class NumberSpiral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        
        long t = Integer.parseInt(br.readLine());

        while(t-->0){
            long y = Integer.parseInt(br.readLine());
            long x = Integer.parseInt(br.readLine());
            
            if(x == y){
                pr.println((x*y)-(x-1));
            }

        }
        pr.close();
}
}