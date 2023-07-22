import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Emily {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("emily.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            int op1 = file.nextInt();
            String op = file.next();
            int op2 = file.nextInt();

            switch (op) {
                case "+" -> System.out.printf("%d + %d = %d\n", op1, op2, op1 + op2);
                case "-" -> System.out.printf("%d - %d = %d\n", op1, op2, op1 - op2);
                case "*", "x", "X" -> System.out.printf("%d %s %d = %d\n", op1, op, op2, op1 * op2);
                case "/" -> System.out.printf("%d / %d = %d remainder %d\n", op1, op2, op1 / op2, op1 % op2);
            }
        }
    }
}
