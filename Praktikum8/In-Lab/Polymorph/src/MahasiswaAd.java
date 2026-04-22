// Nama: Adhyaksa M. Banjar Nahor
// NIM: 240601241440152
// Kelas: B

class MahasiswaAd {
    private int nim;
    private String nama;
    private String programStudi;

    public MahasiswaAd() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public MahasiswaAd(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // Varian 2: dengan String
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    // Varian 3: dengan objek Mahasiswa lain
    public void setProgramStudi(MahasiswaAd mhs) {
        this.programStudi = mhs.programStudi;
    }

    public void tampil() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Program Studi  : " + programStudi);
        System.out.println();
    }
}