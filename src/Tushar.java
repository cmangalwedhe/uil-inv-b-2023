import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tushar {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("tushar.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            int row = file.nextInt(), col = file.nextInt();
            int[][] mat = new int[row][col];

            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    mat[j][k] = file.nextInt();
                }
            }

            String out = "";

            for (int j = 0; j < col; j++) {
                double sum = 0;
                int num = 0;

                for (int k = 0, c = j; k < mat.length && c < col; k++, c++) {
                    sum += mat[k][c];
                    num++;
                }

                out += String.format("%.2f ", sum / num);
            }

            for (int j = 1; j < row; j++) {
                double sum = 0;
                int num = 0;

                for (int k = 0, m = j; k < col && m < row; k++, m++) {
                    sum += mat[m][k];
                    num++;
                }

                out += String.format("%.2f ", sum / num);
            }

            System.out.println(out.trim());
        }
    }
}