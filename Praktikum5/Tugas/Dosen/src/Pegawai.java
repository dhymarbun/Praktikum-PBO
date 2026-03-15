import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {

    private static final DateTimeFormatter FORMAT_TANGGAL_INDONESIA =
            DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int[] hitungMasaKerja() {
        Period p = Period.between(tmt, LocalDate.now());
        return new int[]{p.getYears(), p.getMonths()};
    }

    protected String formatTanggal(LocalDate tanggal) {
        return tanggal.format(FORMAT_TANGGAL_INDONESIA);
    }

    public void printInfo() {
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
    }
}
