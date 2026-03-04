public class Garis {
    /************** ATRIBUT **************/
    private Titik T1;
    private Titik T2;
    private static int counterGaris = 0;

    /************** METHOD **************/
    public Garis() {
        T1 = new Titik();
        T2 = new Titik();
        T1.setAbsis(0);
        T1.setOrdinat(0);
        T2.setAbsis(1);
        T2.setOrdinat(1);
        counterGaris++;
    }

    //****KONSTTRUKTOR */
    public Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }

    //****METHOD */
    public void getTitikAwal() {
        System.out.println("Titik Awal : ");
        T1.printTitik();
    }

    public void getTitikAkhir() {
        System.out.println("Titik Akhir : ");
        T2.printTitik();
    }

    public void setTitikAwal(Titik T1) {
        this.T1 = T1;
    }

    public void setTitikAkhir(Titik T2) {
        this.T2 = T2;
    }

    public void getCounterGaris() {
        System.out.println("Jumlah Garis : " + counterGaris);
    }

    public double getPanjang() {
        return T1.getJarak(T2);
    }

    public double getGradien() {
        double dx = T2.getAbsis() - T1.getAbsis();
        double dy = T2.getOrdinat() - T1.getOrdinat();
        return dy / dx;
    }

    public String getPersamaanGaris() {
        double x1 = T1.getAbsis();
        double y1 = T1.getOrdinat();
        double x2 = T2.getAbsis();
        double y2 = T2.getOrdinat();

        double dx = x2 - x1;
        double epsilon = 1e-9;

        if (Math.abs(dx) < epsilon) {
            return "x = " + formatAngka(x1);
        }

        double m = (y2 - y1) / dx;
        double c = y1 - (m * x1);

        if (Math.abs(c) < epsilon) {
            c = 0;
        }

        String persamaan = "y = " + formatAngka(m) + "x";
        if (c > 0) {
            persamaan += " + " + formatAngka(c);
        } else if (c < 0) {
            persamaan += " - " + formatAngka(-c);
        }

        return persamaan;
    }

    private String formatAngka(double angka) {
        double epsilon = 1e-9;
        if (Math.abs(angka - Math.rint(angka)) < epsilon) {
            return String.valueOf((long) Math.rint(angka));
        }
        return String.valueOf(angka);
    }
    public Titik getTitikTengah() {
        double x1 = T1.getAbsis();
        double x2 = T2.getAbsis();
        double y1 = T1.getOrdinat();
        double y2 = T2.getOrdinat();

        double xm = (x1+x2)/2;
        double ym = (y1+y2)/2;

        Titik tengah = new Titik ();
        tengah.setAbsis(xm);
        tengah.setOrdinat(ym);
        
        return tengah;
    }

    public boolean isGarisSejajar(Garis g) {
        double dx1 = this.T2.getAbsis() - this.T1.getAbsis();
        double dy1 = this.T2.getOrdinat() - this.T1.getOrdinat();
        double dx2 = g.T2.getAbsis() - g.T1.getAbsis();
        double dy2 = g.T2.getOrdinat() - g.T1.getOrdinat();

        double epsilon = 1e-9;
        return Math.abs((dy1 * dx2) - (dy2 * dx1)) < epsilon;
    }

    public boolean isTegakLurus(Garis g) {
        double dx1 = this.T2.getAbsis() - this.T1.getAbsis();
        double dy1 = this.T2.getOrdinat() - this.T1.getOrdinat();

        double dx2 = g.T2.getAbsis() - this.T1.getAbsis();
        double dy2 = g.T2.getOrdinat() - this.T1.getOrdinat();

        double epsilon = 1e-9;

        return (Math.abs(dx1*dx2 + dy1 * dy2)) < epsilon;
    }

    public void printGaris() {
        System.out.println("Garis ((" + T1.getAbsis() + ", " + T1.getOrdinat()
            + "), (" + T2.getAbsis() + ", " + T2.getOrdinat() + "))");
    }
}
