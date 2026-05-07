public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        Kucing k1 = new Kucing("Milo", 4.5);
        Kucing k2 = new Kucing("Luna", 3.2);
        Burung b1 = new Burung("Coco");

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(b1);

        System.out.println("Jumlah elemen: " + p.getNbelm());

        System.out.println("\nAmbil depan: " + p.getAnabul().getNama());

        System.out.println("\nDequeue: " + p.dequeueAnabul().getNama());
    }
}