package PRAK202_2510817210011_FatihAlfayruz;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    private String pembeli;

    public Kopi() {
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getPajak() {
        return harga * 0.11;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}