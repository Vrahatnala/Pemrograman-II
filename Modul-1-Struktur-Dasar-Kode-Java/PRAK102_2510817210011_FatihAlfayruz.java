import java.util.Scanner;

public class PRAK102_2510817210011_FatihAlfayruz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int angkaInput = scanner.nextInt();

        scanner.close();

        int number = angkaInput;
        int count = 0;
        int display;

        while (count <= 9) {
            if (number % 5 == 0) {
                display = (number / 5) - 1;
            } else {
                display = number;
            }

            if (count == 0) {
                System.out.print(display);
            } else {
                System.out.print(", " + display);
            }

            number++;
            count++;
        }

        System.out.println();
    }
}
