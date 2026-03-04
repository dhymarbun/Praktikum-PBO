/* Nama File   : MGaris.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Adhyaksa M. Banjar Nahor
 * Tanggal     : 01/03/2026
 */


public class MGaris{

    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(2);

        Titik T2 = new Titik();
        T2.setAbsis(5);
        T2.setOrdinat(8);

        Titik T3 = new Titik();
        T3.setAbsis(10);
        T3.setOrdinat(12);

        Titik T4 = new Titik();
        T4.setAbsis(9);
        T4.setOrdinat(6);

        Garis g1 = new Garis(T1, T2);
        Garis g2 = new Garis(T3,T4);

        System.out.println(g1.getPanjang());
        System.out.println(g1.getGradien());
        System.out.println(g1.getPersamaanGaris());
        g1.getTitikAwal();
        g1.getTitikAkhir();
        g1.printGaris();

        System.out.println(g2.getPanjang());
        System.out.println(g2.getGradien());
        System.out.println(g2.getPersamaanGaris());
        g2.getTitikAwal();
        g2.getTitikAkhir();
        g2.printGaris();
        
        boolean sejajar = g1.isGarisSejajar(g2);
        System.out.println("Sejajar ga? " + sejajar);

        boolean tegaklurus = g1.isTegakLurus(g2);
        System.out.println("Tegak lurus ga? " + tegaklurus);

    }
}
