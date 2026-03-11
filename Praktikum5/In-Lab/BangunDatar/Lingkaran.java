public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        setJmlSisi(0); 
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getJariJari() {
        return jari;
    }

    @Override
    public void printInfo() {
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}

