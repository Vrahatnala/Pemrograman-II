package PRAK302_2510817210011_FatihAlfayruz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        int jumlahNegara = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            int tanggal = 0;
            int bulan = 0;
            int tahun = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggal = Integer.parseInt(scanner.nextLine());
                bulan = Integer.parseInt(scanner.nextLine());
                tahun = Integer.parseInt(scanner.nextLine());
            }

            daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
        }

        scanner.close();

        for (Negara negara : daftarNegara) {
            String gelar;
            if (negara.getJenisKepemimpinan().equals("presiden")) {
                gelar = "Presiden";
            } else if (negara.getJenisKepemimpinan().equals("monarki")) {
                gelar = "Raja";
            } else {
                gelar = "Perdana Menteri";
            }

            System.out.println("Negara " + negara.getNama() + " mempunyai " + gelar
                    + " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggal()
                        + " " + namaBulan.get(negara.getBulan()) + " " + negara.getTahun());
            }

            System.out.println();
        }
    }
}