package life;

import static life.CurrentGen.matrixCurrentGen;

public class FutureGen {

    String[][] matrixFutureGen = new String[Main.n][Main.n];
    int neighborsCounter = 0;

    public FutureGen(int n) {
    }

    public void futureMatrixGenerator(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        int cols = (i + k + n) % n;
                        int rows = (j + l + n) % n;
                        if (matrixCurrentGen[cols][rows] == "O") {
                            neighborsCounter++;
                        }

                    }
                }
                neighborsCounter--;

                if (matrixCurrentGen[i][j] == "O" && (neighborsCounter < 2 || neighborsCounter > 3)) {
                    matrixFutureGen[i][j] = " ";
                }
                if (matrixCurrentGen[i][j] == "O" && (neighborsCounter == 2 || neighborsCounter == 3)) {
                    matrixFutureGen[i][j] = "O";
                }
                if (matrixCurrentGen[i][j] == " " && neighborsCounter == 3) {
                    matrixFutureGen[i][j] = "O";
                } else {
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
