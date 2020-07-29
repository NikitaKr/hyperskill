package life;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random;
    static int n;
    static int m;
    private static int counter = 0;


    public static void main(String[] args) {
        begin();
        lifeCycle(m);
    }

    public static void begin() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int s = scanner.nextInt();
        m = scanner.nextInt();
        random = new Random(s);
    }

    public static void lifeCycle(int m) {

        if (m == 0) {
            new CurrentGen(n);
        } else {

            while (m > counter) {

                new CurrentGen(n);
                FutureGen FutureGen = new FutureGen(n);
                FutureGen.futureMatrixGenerator(n);
                FutureGen.printFutureMatrix(n);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        FutureGen.matrixFutureGen[i][j] = CurrentGen.matrixCurrentGen[i][j];
                    }
                }
                counter++;

            }
        }

    }
}
