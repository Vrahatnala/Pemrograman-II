package PRAK203_2510817210011_FatihAlfayruz;

//Error karena nama class tidak sama dengan nama filenya
//public class Employee {
public class Pegawai {
    public String nama;

    //disini error karena tipe datanya pakai char, padahal asal itu berisi lebih dari 1 kata
    //kalo pakai char tidak bisa, jadi diganti dengan tipe data string
    //public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Error kkarena tidak ada parameternya di setJabatan
    //public void setJabatan() {
    //    this.jabatan = j;
    //}
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
