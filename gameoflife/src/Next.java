public class Next {

    int[][] nextMatrix;
    int counter = 0;

    public Next() {

    }

    public void generate() {

        nextMatrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        int row = (i + k + 5) % 5;
                        int col = (j + l + 5) % 5;

                        if (Current.currentMatrix[row][col] == 1) {
                            if (col != j || row != i) {
                                counter++; }
                            }
                        }
                    }


                    if (Current.currentMatrix[i][j] == 0 && counter == 3) {
                        nextMatrix[i][j] = 1;
                    }
                    if (Current.currentMatrix[i][j] == 1 && (counter == 2 || counter == 3)) {
                        nextMatrix[i][j] = 1;
                    }
                    if (Current.currentMatrix[i][j] == 1 && (counter < 2 || counter > 3)) {
                        nextMatrix[i][j] = 0;
                    }


                    counter = 0;
                    System.out.print(nextMatrix[i][j]);
                }
                System.out.println();
            }
        }

        public void printNextMatrix () {
            Current current = new Current();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(nextMatrix[i][j]);
                }

                System.out.println();
            }
        }
    }
