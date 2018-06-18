class RunnableMultiplier implements Runnable {

    int[][] matrix1;
    int[][] matrix2;
    int[][] matrix3;
    int linenumber;

    RunnableMultiplier(int[][] matrix1, int[][] matrix2, int[][] matrix3, int linenumber) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.matrix3 = matrix3;
        this.linenumber = linenumber;
    }

    public void run() {
        for (int i = 0; i < matrix2[0].length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                int mult = matrix1[linenumber][j] * matrix2[j][i];
                matrix3[linenumber][i] += mult;
            }
//            System.out.println(linenumber + 1 + " thread is running");
//            System.out.println(matrix3[linenumber][i]);
        }
    }
}

