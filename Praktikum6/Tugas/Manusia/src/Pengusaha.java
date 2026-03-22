import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(getTanggalMulaiKerja(), LocalDate.now()).getYears() + 5;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }
}
