import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petra {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("petra.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            int number = file.nextInt();
            int reverse = Integer.parseInt(new StringBuilder("" + number).reverse().toString());

            System.out.println(gcf(number, reverse));
        }
    }

    static int gcf(int a, int b) {
        return b == 0 ? a : gcf(b, a%b);
    }
}
