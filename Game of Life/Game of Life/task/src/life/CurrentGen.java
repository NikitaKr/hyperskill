package life;

public class CurrentGen {

    static String[][] matrixCurrentGen;
    int currentAlive = 0;


    public CurrentGen() {

    }

    public void currentMatrixGenerator(int n) {

        matrixCurrentGen = new String[Main.n][Main.n];
        currentAlive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Main.random.nextBoolean()) {
                    matrixCurrentGen[i][j] = "O";
                    currentAlive++;
                } else {
                    matrixCurrentGen[i][j] = " ";
                }
            }

        }
    }

    public void printCurrentGen(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixCurrentGen[i][j]);
            }
            System.out.println();
        }
    }

}
