package PRAK201_2510817210011_FatihAlfayruz;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;
    private double totalHarga;
    private double diskon;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;

        double hargaPerKg = harga / berat;
        this.totalHarga = hargaPerKg * jumlahBeli;
    }

    public double getDiskon() {
        double hargaPerKg = harga / berat;
        double hargaPer4Kg = hargaPerKg * 4;
        double diskonPerKemasan = hargaPer4Kg * 0.02;

        int jumlahKemasan = (int) (jumlahBeli / 4);

        double totalDiskon = 0;
        for (int i = 0; i < jumlahKemasan; i++) {
            totalDiskon += diskonPerKemasan;
        }
        return totalDiskon;
    }

    public void info() {
        this.diskon = getDiskon();
        double hargaSetelahDiskon = this.totalHarga - this.diskon;

        System.out.println("Nama PRAK1.Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", totalHarga);
        System.out.printf("Total Diskon: Rp%.2f%n", diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n%n", hargaSetelahDiskon);
    }
}
