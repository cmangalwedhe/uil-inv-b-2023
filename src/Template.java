import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("file.dat"));
        int N = file.nextInt();
    }
}
