
public class Current {

    int n = 0;
    static int[][] currentMatrix;


    public Current() {

    }

    public void currentMatrix() {

        currentMatrix = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        this.n = 5;

        for (int i = 0; i < currentMatrix.length; i++) {
            for (int j = 0; j < currentMatrix[i].length; j++) {
                System.out.print(currentMatrix[i][j]);
            }

            System.out.println();
        }
    }


}
