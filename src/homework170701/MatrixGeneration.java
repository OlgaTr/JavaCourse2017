package homework170701;

import java.util.Random;

public class MatrixGeneration {

    public static int[][] generate(int rowsNumber, int columnsNumber) {
        int[][] matrix = new int[rowsNumber][columnsNumber];
        Random random = new Random();
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                matrix[i][j] = random.nextInt(200) - 100;
            }
        }
        return matrix;
    }
}
