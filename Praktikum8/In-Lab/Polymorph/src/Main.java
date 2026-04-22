public class Main {
    public static void main(String[] args) {

        MahasiswaAd m1 = new MahasiswaAd();
        m1.setNim(101);
        m1.setNama("Andi");
        
        m1.setProgramStudi();
        m1.tampil();

        MahasiswaAd m2 = new MahasiswaAd();
        m2.setNim(102);
        m2.setNama("Budi");

        m2.setProgramStudi("Informatika");
        m2.tampil();

        MahasiswaAd m3 = new MahasiswaAd();
        m3.setNim(152);
        m3.setNama("Adhyaksa Margandatua Banjar Nahor");

        m3.setProgramStudi(m2);
        m3.tampil();
    }
}