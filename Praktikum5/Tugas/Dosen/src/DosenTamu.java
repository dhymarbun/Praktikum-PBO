import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate tglAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tglAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public String hitungSisaKontrak() {
        Period p = Period.between(LocalDate.now(), tglAkhirKontrak);
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    @Override
    public void printInfo() {

        System.out.println("NIP\t\t: " + nip);
        System.out.println("NIDK\t\t: " + nidk);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Akhir Kontrak\t: " + formatTanggal(tglAkhirKontrak));
        System.out.println("Sisa Kontrak\t: " + hitungSisaKontrak());
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + hitungTunjangan());
    }
}
