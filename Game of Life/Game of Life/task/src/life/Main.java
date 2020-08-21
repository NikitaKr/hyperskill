package life;


import java.util.Random;
import java.util.Scanner;

public class Main extends Thread {

    protected static int n;
    protected static int s;
    protected static int m;
    protected static int counter = 1;
    protected static Random random;

    public static void main(String[] args) throws InterruptedException {
        begin();
        lifeCycle(m);
    }


    public static void begin() {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        //s = scanner.nextInt();
        m = 10;
        random = new Random();
    }

    public static void lifeCycle(int m) throws InterruptedException {

        CurrentGen currentGen = new CurrentGen();
        FutureGen futureGen = new FutureGen();


        if (counter == 1) {

            currentGen.currentMatrixGenerator(n);
            System.out.println("Generation #" + counter);
            System.out.println("Alive: " + currentGen.currentAlive);
            currentGen.printCurrentGen(n);
            counter++;
            Thread.sleep(1000);
        }

        if (counter == 2) {
            futureGen.futureMatrixGenerator(n);
            System.out.println("Generation #" + counter);
            System.out.println("Alive: " + futureGen.aliveNumber);
            futureGen.printFutureMatrix(n);
            counter++;
            Thread.sleep(1000);
        }

        if (counter > 2) {
            for (int e = 2; e < m + 1; e++) {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        CurrentGen.matrixCurrentGen[i][j] = FutureGen.matrixFutureGen[i][j];
                    }
                }

                futureGen.futureMatrixGenerator(n);
                System.out.println("Generation #" + counter);
                System.out.println("Alive: " + futureGen.aliveNumber);
                futureGen.printFutureMatrix(n);

                counter++;
                Thread.sleep(1000);
            }

        }
    }
}



