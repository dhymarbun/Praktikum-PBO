// Nama: Adhyaksa M. Banjar Nahor
// NIM: 240601241440152
// Kelas: B

// I. Coercsion
public class KonversiData {

    public static void main(String[] args) {
        // (a) Ilustrasi konversi tipe (polimorfisme sederhana)
        int nilai = 65;

        // sebagai integer
        System.out.println("Integer: " + nilai);

        // sebagai karakter
        char karakter = (char) nilai;
        System.out.println("Char: " + karakter);

        // sebagai real (double)
        double real = (double) nilai;
        System.out.println("Double: " + real);

        // (b) Konversi kembali double ke integer
        double angkaReal = 65.9;
        int angkaInt = (int) angkaReal; 
        System.out.println("Double ke Integer: " + angkaInt);

        // (c) String X dan Y
        String X = "1234";
        String Y = "5678";

        // konkatenasi
        String S = X + Y;
        System.out.println("S (Konkatenasi): " + S);

        // penjumlahan numerik
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Z (Penjumlahan): " + Z);

        // (d) String P dan Q (double)
        String P = "12.34";
        String Q = "56.78";

        // konkatenasi
        String R = P + Q;
        System.out.println("R (Konkatenasi): " + R);

        // penjumlahan numerik
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("D (Penjumlahan): " + D);

        // (e) Konversi S ke Integer A
        int A = Integer.parseInt(S);
        System.out.println("A (dari S): " + A);

        // (f) Konversi A ke String T
        String T = Integer.toString(A);
        System.out.println("T (dari A): " + T);
    }
}