import java.util.Scanner;

public class PRAK101_2510817210011_FatihAlfayruz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = scanner.nextInt();


        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = scanner.nextInt();


        if (bulan < 1 || bulan > 12) {
            System.exit(0);
        }

        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        int maxHari = 31;
        if (bulan == 2) {
            maxHari = kabisat ? 29 : 28;
        } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            maxHari = 30;
        }

        if (tanggal < 1 || tanggal > maxHari) {
            System.exit(0);
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int height = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = scanner.nextDouble();

        if (height < 0 || weight < 0) {
            System.exit(0);
        }

        scanner.close();

        String[] monthNames = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println("Nama Lengkap " + fullName + ", Lahir di " + tempatLahir
                + " pada Tanggal " + tanggal + " " + monthNames[bulan - 1] + " " + tahun);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}
