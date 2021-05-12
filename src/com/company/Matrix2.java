import java.util.Random;

public class Matrix2 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < i) {
                    System.out.print(matrix[i][j]);
                    sum = sum + matrix[i][j];
                }

            }
            System.out.println();
        }
        System.out.println(sum);

    }
}
