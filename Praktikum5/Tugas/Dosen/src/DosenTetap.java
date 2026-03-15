import java.time.LocalDate;

public class DosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama,
                      LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja()[0];
        return 0.02 * masaKerja * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    @Override
    public void printInfo() {

        int[] mk = hitungMasaKerja();

        System.out.println("NIP\t\t: " + nip);
        System.out.println("NIDN\t\t: " + nidn);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Masa Kerja\t: " + mk[0] + " tahun " + mk[1] + " bulan");
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungTanggalPensiun()));
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + hitungTunjangan());
    }
}
