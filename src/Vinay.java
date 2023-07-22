import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Vinay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("vinay.dat"));
        int N = file.nextInt();
        file.nextLine();

        for (int i = 0; i < N; i++) {
            HashMap<Character, Long> map = new HashMap<>();
            String line = file.nextLine();

            String check = line.toLowerCase().replaceAll("\\W+", "");

            for (int j = 0; j < check.length(); j++)
                map.put(check.charAt(j), map.getOrDefault(check.charAt(j), 0L) + 1);

            if (map.values().stream().filter(a -> a % 2 == 1).count() > 1) {
                System.out.printf("%s can not be rearranged to form a palindrome.%n", line);
                continue;
            }

            map.replaceAll((a, v) -> v / 2);

            long factorial = factorial(check.length() / 2);

            for (Character a: map.keySet()) {
                factorial /= factorial(map.get(a));
            }

            System.out.printf("%s can be rearranged to form %d distinct palindrome(s).%n", line, factorial);
        }
    }

    static long factorial(long a) {
        return a <= 1 ? 1 : a * factorial(a - 1);
    }
}
