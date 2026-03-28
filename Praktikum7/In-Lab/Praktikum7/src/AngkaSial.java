public class AngkaSial {
    public void cobaAngkaSial(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        } else {
            System.out.println(angka + " bukan angka sial");
        }
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngkaSial(10);
            as.cobaAngkaSial(13);
            as.cobaAngkaSial(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.err.println("hati hati memasukkan angka!!!");
        }
    }

}
