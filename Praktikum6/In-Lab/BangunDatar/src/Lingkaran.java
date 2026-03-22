/*
 * File       : Lingkaran.java
 * Deskripsi  : Class untuk lingkaran
 * Pembuat    : Adhyaksa M. Banjar Nahor
 * Tanggal    : 22 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        setJmlSisi(0); 
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getJariJari() {
        return jari;
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}

