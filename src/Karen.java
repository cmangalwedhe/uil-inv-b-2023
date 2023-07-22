import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Karen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("karen.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            int num = file.nextInt();
            int floor = (int) (Math.floor(Math.sqrt(num)));
            int ceil = (int) (Math.ceil(Math.sqrt(num)));

            int diffOne = Math.abs(num - floor * floor);
            int diffTwo = Math.abs(num - ceil * ceil);

            System.out.println(diffOne < diffTwo ? floor * floor : ceil * ceil);
        }
    }
}
