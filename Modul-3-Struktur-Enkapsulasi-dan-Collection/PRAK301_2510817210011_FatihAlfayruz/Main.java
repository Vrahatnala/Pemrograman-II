package PRAK301_2510817210011_FatihAlfayruz;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int jumlahDadu = scanner.nextInt();

    scanner.close();

    LinkedList<Dadu> daftarDadu = new LinkedList<>();

    for (int i = 0; i < jumlahDadu; i++) {
      daftarDadu.add(new Dadu());
    }

    int total = 0;
    int nomor = 1;

    for (Dadu dadu : daftarDadu) {
      System.out.println("Dadu ke-" + nomor + " bernilai " + dadu.getNilai());
      total += dadu.getNilai();
      nomor++;
    }

    System.out.println("Total nilai dadu keseluruhan " + total);
  }
}

