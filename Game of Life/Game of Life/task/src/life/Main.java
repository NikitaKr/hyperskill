package life;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        String[][] matrix = new String[n][n];
        Random random = new Random(s);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (random.nextBoolean() == true) {
                    matrix[i][j] = "O";
                } else {
                    matrix[i][j] = " ";
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }


}
