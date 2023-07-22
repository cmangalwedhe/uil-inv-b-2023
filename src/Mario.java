import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mario {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("mario.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            int flip = file.nextInt();
            String word = file.next();

            if (flip > word.length()) {
                System.out.println("error");
                continue;
            }

            if (flip > word.length() / 2) {
                System.out.println(new StringBuilder(word).reverse());
                continue;
            }

            String first = word.substring(0, flip);
            String last = word.substring(word.length() - flip);
            String middle = word.substring(flip, word.length() - flip);

            System.out.println(new StringBuilder(last).reverse() + middle + new StringBuilder(first).reverse());
        }
    }
}
