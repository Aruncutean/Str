package L1.ex2;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(new int[][]{{2, 3, 1}, {7, 1, 6}, {9, 2, 4}});
        Matrix matrix1 = new Matrix(new int[][]{{8, 5, 3}, {3, 9, 2}, {2, 7, 3}});


        int[][] matrixSum = matrix.sum(matrix1);

        int[][] matrixProd = matrix.prod(matrix1);


        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum.length; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum.length; j++) {
                System.out.print(matrixProd[i][j] + " ");
            }
            System.out.println();
        }


    }
}
