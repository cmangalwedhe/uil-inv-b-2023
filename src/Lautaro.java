import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lautaro {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("lautaro.dat"));
        int N = file.nextInt(); file.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println(file.nextLine().trim().matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}") ? "Valid Phone Number." : "No Calls for You.");
        }
    }
}
