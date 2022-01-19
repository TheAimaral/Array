import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер массива:");

        int n = 0;

        while (n <= 3) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                System.out.println("Повторите ввод:");
            }
        }
        int[] first = new int[n];
        int evenNumbers = 0;

        for (int i = 0; i < n; i++) {
            first[i] = (int) (Math.random() * (n + 1));
            if (first[i] % 2 == 0) {
                evenNumbers++;
            }
        }

        System.out.println(Arrays.toString(first));
        int[] second = new int[evenNumbers];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (first[i] % 2 == 0) {
                second[index] = first[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(second));
    }
}