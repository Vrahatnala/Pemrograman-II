package PRAK203_2510817210011_FatihAlfayruz;

public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        //Barisnya error karena tidak ada ; di akhir
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        //ini ditambah supaya nilai umurnya 17 seperti di output
        p1.umur = 17;

        //ini bukan error tapi disesuaikan aja supaya kaya outputnya
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }

}
