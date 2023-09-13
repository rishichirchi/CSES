import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dna = scan.nextLine();

        Map<Character, Integer> set = new HashMap<>();

        int n = dna.length();

        for(int i = 0; i < n; i++){
            char temp = dna.charAt(i);
            if(set.containsKey(temp)){
                int value = set.get(temp);
                set.replace(temp, ++value);
            }
            else{
                set.put(temp, 1);
            }
        }
        System.out.println(set.values());
        int maxInstance = 0;
        for(int i = 0; i < set.size() ; i++){
            if(set.get(dna.charAt(i)) > set.get(dna.charAt(i+1))){
                maxInstance = set.get(dna.charAt(i));
            }
            else{
                maxInstance = set.get(dna.charAt(i+1));

            }
        }
        System.out.println(maxInstance);
    }
}
