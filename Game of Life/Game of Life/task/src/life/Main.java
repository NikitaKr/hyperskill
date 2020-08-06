package life;

import java.util.Random;
import java.util.Scanner;

public class Main {

    protected static int n;
    protected static int s;
    protected static int m;
    protected static int counter = 1;
    protected static Random random;

    public static void main(String[] args) {
        begin();
        lifeCycle(m);

    }

    public static void begin() {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        s = scanner.nextInt();
        m = scanner.nextInt();
        random = new Random(s);
    }

    public static void lifeCycle(int m) {

        if (m == 0) {
            CurrentGen currentGen = new CurrentGen();
            currentGen.currentMatrixGenerator(n);
            currentGen.printCurrentGen(n);
        }
        if (m == 1) {
            CurrentGen currentGen = new CurrentGen();
            currentGen.currentMatrixGenerator(n);

            FutureGen futureGen = new FutureGen();
            futureGen.futureMatrixGenerator(n);
            futureGen.printFutureMatrix(n);
        }
        if (m > 1) {

            CurrentGen currentGen = new CurrentGen();
            currentGen.currentMatrixGenerator(n);
            FutureGen futureGen = new FutureGen();
            futureGen.futureMatrixGenerator(n);


            for (int e = 2; e < m + 1; e++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        CurrentGen.matrixCurrentGen[i][j] = FutureGen.matrixFutureGen[i][j];
                    }
                }
                futureGen.futureMatrixGenerator(n);

                counter++;
            }
            futureGen.printFutureMatrix(n);


        }


    }


}



