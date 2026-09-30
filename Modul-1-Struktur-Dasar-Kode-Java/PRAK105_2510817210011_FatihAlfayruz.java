import java.util.Scanner;

public class PRAK105_2510817210011_FatihAlfayruz {

    static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();

        scanner.close();

        double volume = PHI * radius * radius * height;
        String roundedVolume = String.format("%.3f", volume);

        System.out.println("Volume tabung dengan jari-jari " + radius + " cm dan");
        System.out.println("tinggi " + height + " cm adalah " + roundedVolume + " m3");
    }
}
