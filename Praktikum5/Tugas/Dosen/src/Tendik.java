import java.time.LocalDate;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja()[0];
        return 0.01 * masaKerja * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    @Override
    public void printInfo() {

        int[] mk = hitungMasaKerja();

        System.out.println("NIP\t\t: " + nip);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t: Tendik");
        System.out.println("Bidang\t\t: " + bidang);
        System.out.println("Masa Kerja\t: " + mk[0] + " tahun " + mk[1] + " bulan");
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungTanggalPensiun()));
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + hitungTunjangan());
    }
}
