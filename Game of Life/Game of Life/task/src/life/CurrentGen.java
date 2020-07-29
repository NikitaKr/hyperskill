package life;

public class CurrentGen {

    static String[][] matrixCurrentGen;

    public CurrentGen(int n) {

        matrixCurrentGen = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Main.random.nextBoolean() == true) {
                    matrixCurrentGen[i][j] = "O";
                } else {
                    matrixCurrentGen[i][j] = " ";
                }
                System.out.print(matrixCurrentGen[i][j]);
            }
            System.out.println();
        }
    }
}
