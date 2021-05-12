import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        arrayInitialization(array);
        int[] array2 = changeSign(array);
        printArray(array2);

    }

    public static int[] arrayInitialization(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return  array;

    }
    public static void  printArray(int [] array){

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[]  changeSign(int [] array){
        int[] newArray = new int[10];
        for (int i = 0; i <array.length ; i++) {
            newArray[i]= -array[i];
        }
        return newArray;
    }

}

