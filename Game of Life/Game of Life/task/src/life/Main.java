package life;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random;
    static int n;

    enum state {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int s = scanner.nextInt();
        int m = scanner.nextInt();

        random = new Random(s);

        new CurrentGen(n);

    }


}
