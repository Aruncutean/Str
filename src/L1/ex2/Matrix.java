package L1.ex2;

public class Matrix {

    private int m[][];


    Matrix(int m[][]) {
        this.m = m;

    }


    public int[][] getMatrix() {
        return m;
    }

    public int[][] sum(Matrix m1) {

        int mSum[][] = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                mSum[i][j] = m[i][j] + m1.getMatrix()[i][j];
            }

        }
        return mSum;
    }

    public int[][] prod(Matrix m1) {
        int mProd[][] = new int[3][3];


        for(int i=0;i<m.length;i++)
        {

            for(int j=0;j<m1.getMatrix().length;j++)
            {

            }
        }


        return mProd;
    }


}
