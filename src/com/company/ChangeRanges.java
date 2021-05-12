import java.util.Scanner;

public class ChangeRanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer");
        int x = scanner.nextInt();
        x = x / 100;
        switch (x) {
            case 0:
                System.out.println("number is in 0 -> 99 range");
                break;
            case 1:
                System.out.println("number is in 100 -> 199 range");
                break;
            case 2:
                System.out.println("number is in 200 -> 299 range");
                break;
            default:
                System.out.println("number is in other range");
                break;
        }
    }
}
