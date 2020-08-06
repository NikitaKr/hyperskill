package life;

import static life.CurrentGen.matrixCurrentGen;

public class FutureGen {

    static String[][] matrixFutureGen;
    int neighborsCounter = 0;

    public FutureGen() {

    }

    public void futureMatrixGenerator(int n) {

        matrixFutureGen = new String[Main.n][Main.n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        int rows = (i + k + n) % n;
                        int cols = (j + l + n) % n;

                        if (matrixCurrentGen[rows][cols].equals("O")) {
                            if (cols != j || rows != i) {
                                neighborsCounter++;
                            }
                        }
                    }
                }

                //rules
                //Birth
                if (matrixCurrentGen[i][j].equals(" ") && neighborsCounter == 3) {
                    matrixFutureGen[i][j] = "O";
                }
                //Death
                if (matrixCurrentGen[i][j].equals("O") && (neighborsCounter == 3 || neighborsCounter == 2)) {
                    matrixFutureGen[i][j] = "O";
                }
                if (matrixCurrentGen[i][j] == "O" && (neighborsCounter < 2 || neighborsCounter > 3)) {
                    matrixFutureGen[i][j] = " ";
                }
                if (matrixCurrentGen[i][j].equals(" ") && neighborsCounter != 3) {
                    matrixFutureGen[i][j] = " ";
                }

                neighborsCounter = 0;


            }
        }

    }

    public void printFutureMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixFutureGen[i][j]);
            }
            System.out.println();
        }


    }

}
