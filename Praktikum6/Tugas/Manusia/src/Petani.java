import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggalMulaiKerja(), LocalDate.now()).getYears() + 5;
    }

    @Override
    public double hitungPajak(){
        return 0 * getPendapatan();
    }
}