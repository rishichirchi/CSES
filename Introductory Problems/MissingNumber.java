import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        int n = scan.nextInt();

        for(int i = 1; i < n; i++){
            int num = scan.nextInt();
            set.add(num);
        }

        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                System.out.print(i);
            }
        }


    }
}
