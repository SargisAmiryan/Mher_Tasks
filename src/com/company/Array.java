public class Array {
    public static void main(String[] args) {
        int[] array;
        array = new int[1000];
        int a = 0;
        for (int i = 1; i < 7000; i++) {
            if (i % 7 == 0) {
                array[a] = i;
                System.out.println(array[a]);
                a++;

            }

        }


    }
}
