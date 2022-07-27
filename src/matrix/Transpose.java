package matrix;

public class Transpose {
    public static void main(String[] args) {

        int row = 2, column = 3;
        int[][] matrix = { {8, 5, 1}, {7, 6, 2} };

        // Current matrix
        System.out.println("Matrix: ");
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }


        System.out.println("Transpose: ");

        display(transpose);

    }

    public static void display(int[][] matrix) {

        for(int[] row : matrix) {
            for (int column : row) {

                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
