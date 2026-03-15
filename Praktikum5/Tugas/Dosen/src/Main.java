import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Data Dosen Tetap ===");
        DosenTetap dt = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );

        dt.printInfo();
        System.out.println();
        System.out.println("=== Data Dosen Tamu ==="); 

        DosenTamu dtm = new DosenTamu(
                "9545647549",
                "78647325",
                "Budi",
                LocalDate.of(1985,6,10),
                LocalDate.of(2020,2,1),
                3000000,
                "Fakultas Teknik", LocalDate.of(2028,12,31)
        );

        dtm.printInfo();
        System.out.println();
        System.out.println("=== Data Tendik ===");

        Tendik t = new Tendik(
                "9545647550",
                "78647326",
                LocalDate.of(1992,7,15),
                LocalDate.of(2018,3,1),
                4000000,
                "Administrasi Akademik"
        );

        t.printInfo();
    }
}