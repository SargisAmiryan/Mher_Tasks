import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 55;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);


    }
public static class AvarageSum {

    public static void calculate(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum / array.length;
        System.out.println(sum);
    }

    public static void calculate(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] mat = new int[4][5];


    }

}public static class Distance {
    public static double calculateDistance (double x, double y){
        double distance = Math.sqrt(x*x+y*y);
        return distance;
    }
    public static double calculateDistance (double x1, double y1,double x2, double y2){
        double distance =Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
        return distance;

    }

}public static class MatrixToArray {
    public static int[] averageMatrix(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i] = array[i] + matrix[i][j];
            }
        }
        return array;
    }

    public static int[] averageMatrix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;

    }
}}
