import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fiorella {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("fiorella.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            int w = file.nextInt(), x = file.nextInt(), y = file.nextInt(), z = file.nextInt(), G = file.nextInt();

            double n = Math.log(((double) G-z) / (w * y));
            double d = Math.log(x);

            System.out.println((int) (n / d));
        }
    }
}
