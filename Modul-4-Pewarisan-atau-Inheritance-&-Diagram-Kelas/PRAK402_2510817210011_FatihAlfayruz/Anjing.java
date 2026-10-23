package PRAK402_2510817210011_FatihAlfayruz;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);

        System.out.print("Memiliki kemampuan :");
        for (String skill : kemampuan) {
            System.out.print(" " + skill);
        }
        System.out.println();
    }
}