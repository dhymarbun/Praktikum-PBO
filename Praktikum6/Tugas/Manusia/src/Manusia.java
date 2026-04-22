+
import java.time.LocalDate;

/*
 * File       : Manusia.java
 * Deskripsi  : Abstract class untuk manusia
 * Pembuat    : Adhyaksa M. Banjar Nahor
 * Tanggal    : 22 Maret 2026
 */

public abstract class Manusia {
    private String nama;
    private LocalDate tanggalMulaiKerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    public Manusia(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tanggalMulaiKerja = tanggalMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String  getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalMulaiKerja() {
        return tanggalMulaiKerja;
    }

  public void setTanggalMulaiKerja(LocalDate tanggalMulaiKerja) {
        this.tanggalMulaiKerja = tanggalMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tanggalMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}
