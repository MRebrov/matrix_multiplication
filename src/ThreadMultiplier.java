public class ThreadMultiplier {
    int[][] matrix1;
    int[][] matrix2;
    int[][] matrix3;
    int k;
    int l;
    int n;
    int m;

    ThreadMultiplier(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.matrix3 = new int[matrix1.length][matrix2[0].length];
        k = matrix1[0].length;          //columns
        l = matrix2.length;             //rows
        n = matrix1.length;             //rows
        m = matrix2[0].length;          //columns
    }

    public int[][] multiplication() throws InterruptedException {
        if (k == l) {
            Thread[] pool = new Thread[n];
            for (int i = 0; i < n; i++) {
                RunnableMultiplier rm = new RunnableMultiplier(matrix1, matrix2, matrix3, i);
                pool[i] = new Thread(rm);
                pool[i].start();
            }
            for (int i = 0; i < n; i++) {
                pool[i].join();
            }
            return matrix3;
        }
        else
            System.out.println("These two matrices are can not be multiplied!");
        return matrix3;
    }
}
