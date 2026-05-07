// Nama: Adhyaksa Margandatua Banjar Nahor
// NIM : 24060124140152
// Kelas: Praktikum PBO B

import java.util.ArrayList;

public class Teman {
    private ArrayList<String> Lnama;
    private Integer nbelm;

    public Teman(ArrayList<String> Lnama, Integer nbelm) {
        this.Lnama = Lnama;
        this.nbelm = nbelm;
    }

    public Integer getNbelm() {
        return nbelm;
    }

    public ArrayList<String> getNama() {
        return Lnama;
    }

    public void setNama(ArrayList<String> Lnama) {
        this.Lnama = Lnama;
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        } else {
            System.out.println("Nama tidak ditemukan: " + nama);
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru){
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namaBaru);
        } else {
            System.out.println("Nama tidak ditemukan: " + nama);
        }
    }

    public void countNama() {
        System.out.println("Jumlah teman: " + nbelm);
    }
}