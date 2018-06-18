public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix1 = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}
        };
        int[][] matrix2 = {
                {1, 2},
                {1, 2},
                {1, 2}
        };

        int[][] result = new ThreadMultiplier(matrix1, matrix2).multiplication();
        int i = result[0].length;
        int j = result.length;
        for (int k = 0; k < j; k++) {
            System.out.print("{");
            for (int l = 0; l < i; l++) {
                System.out.print(" " + result[k][l] + " ");
            }
            System.out.println("}");
        }
    }
}