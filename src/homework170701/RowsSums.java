package homework170701;

public class RowsSums {

    private static final int ROWS_NUMBER = 10;
    private static final int COLUMNS_NUMBER = 3;

    public static void main(String[] args) {
        int[][] matrix = MatrixGeneration.generate(ROWS_NUMBER, COLUMNS_NUMBER);

        for (int i = 0; i < ROWS_NUMBER; i++) {
            for (int j = 0; j < COLUMNS_NUMBER; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        OUTER: for (int i = 0; i < ROWS_NUMBER; i++) {
            int result = 0;
            for (int j = 0; j < COLUMNS_NUMBER; j++) {
                if (matrix[i][j] < 0) {
                    continue OUTER;
                } else {
                    result += matrix[i][j];
                }
            }
            System.out.println("The sum of values in the row " + (i + 1) + ": " + result);
        }
    }
}
