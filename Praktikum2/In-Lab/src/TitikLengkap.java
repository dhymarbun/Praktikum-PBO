public class Titik {
    /************** ATRIBUT **************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /************** METHOD **************/
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    double getJarak(Titik T) {
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
