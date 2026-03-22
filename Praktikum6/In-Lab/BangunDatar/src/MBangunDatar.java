public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // error karena abstract class
        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        BangunDatar L1 = new Lingkaran(7, "Kuning", "Hitam");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Abu");

        P1.printInfo();
        System.out.println();

        P2.printInfo();
        System.out.println();

        L1.printInfo();
        System.out.println();

        L2.printInfo();
        System.out.println();

        P1.isEqualKeliling(P2);
        System.out.println("Apakah keliling P1 sama dengan P2? " + P1.isEqualKeliling(P2));
        P1.isEqualLuas(P2);
        System.out.println("Apakah luas P1 sama dengan P2? " + P1.isEqualLuas(P2));
        L1.isEqualKeliling(L2);
        System.out.println("Apakah keliling L1 sama dengan L2? " + L1.isEqualKeliling(L2));
        L1.isEqualLuas(L2);
        System.out.println("Apakah luas L1 sama dengan L2? " + L1.isEqualLuas(L2));

    P2.zoomIn();
    System.out.println("Setelah zoom in:");
    P2.printInfo();
    System.out.println();

    P2.zoomOut();
    System.out.println("Setelah zoom out:");
    P2.printInfo();
    System.out.println();

    P2.zoom(150);
    System.out.println("Setelah zoom 150%:");
    P2.printInfo();
    System.out.println();

    L2.zoomIn();
    System.out.println("Setelah zoom in:");
    L2.printInfo();
    System.out.println();

    L2.zoomOut();
    System.out.println("Setelah zoom out:");
    L2.printInfo();
    System.out.println();

    L2.zoom(200);
    System.out.println("Setelah zoom 200%:");
    L2.printInfo();
    System.out.println();

    } 

}
