import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        // Implementasi perhitungan masa kerja untuk PNS
        return Period.between(getTanggalMulaiKerja(), LocalDate.now()).getYears() + 2;
    }

    @Override
    public double hitungPajak() {
        // Implementasi perhitungan pajak untuk PNS
        return 0.1 * getPendapatan();
    }
}
