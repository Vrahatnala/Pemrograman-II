import java.util.Scanner;

public class PRAK103_2510817210011_FatihAlfayruz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int n = scanner.nextInt();
        int angkaInput = scanner.nextInt();

        scanner.close();

        int number = angkaInput;
        int count = 0;

        do {
            if (number % 2 != 0) {
                if (count > 0) System.out.print(", ");
                System.out.print(number);
                count++;
            }
            number++;
        } while (count < n);

        System.out.println();
    }
}
