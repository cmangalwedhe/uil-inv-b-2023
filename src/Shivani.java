import java.io.*;
import java.util.*;
import java.math.*;

public class Shivani {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("shivani.dat"));
        int N = file.nextInt();

        for (int i = 0; i < N; i++) {
            BigInteger num = file.nextBigInteger();
            System.out.println(num.multiply(num.add(BigInteger.ONE)).multiply(num.add(BigInteger.TWO)).divide(BigInteger.valueOf(6)));
        }
    }
}
