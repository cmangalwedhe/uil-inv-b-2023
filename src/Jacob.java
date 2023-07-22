import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jacob {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("jacob.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            double pi = 3;
            double val = 2;
            int term = file.nextInt();

            for (int j = 0; j < term; j++) {
                double denom = val * (val + 1) * (val += 2);

                if (j % 2 == 0)
                    pi += (4. / denom);
                else
                    pi -= (4. / denom);
            }

            System.out.printf("%.13f%n", pi);
        }
    }
}
