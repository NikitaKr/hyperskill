package life;

public class CurrentGen {

    static String[][] matrixCurrentGen;

    public CurrentGen() {

    }

    public void currentMatrixGenerator(int n) {

        matrixCurrentGen = new String[Main.n][Main.n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Main.random.nextBoolean()) {
                    matrixCurrentGen[i][j] = "O";
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
