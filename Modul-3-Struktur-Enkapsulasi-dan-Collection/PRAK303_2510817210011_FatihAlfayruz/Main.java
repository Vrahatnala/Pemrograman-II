package PRAK303_2510817210011_FatihAlfayruz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        HashMap<String, Mahasiswa> mahasiswaPerNim = new HashMap<>();

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(scanner.nextLine());

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = scanner.nextLine();

                if (mahasiswaPerNim.containsKey(nim)) {
                    System.out.println("NIM " + nim + " sudah terdaftar.");
                } else {
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    daftarMahasiswa.add(mahasiswa);
                    mahasiswaPerNim.put(nim, mahasiswa);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = scanner.nextLine();

                Mahasiswa mahasiswa = mahasiswaPerNim.get(nim);

                if (mahasiswa == null) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                } else {
                    daftarMahasiswa.remove(mahasiswa);
                    mahasiswaPerNim.remove(nim);
                    System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nim = scanner.nextLine();

                Mahasiswa mahasiswa = mahasiswaPerNim.get(nim);

                if (mahasiswa == null) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                } else {
                    System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (pilihan == 0) {
                daftarMahasiswa.clear();
                mahasiswaPerNim.clear();
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }
}
