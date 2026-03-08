public class Mahasiswa {

    /*************** ATRIBUT ***************/
    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul;
    private int jumlahMatKul;

    private Dosen dosenWali;
    private Kendaraan kendaraan; // komposisi

    /*************** KONSTRUKTOR ***************/

    // konstruktor tanpa parameter
    public Mahasiswa() {
        listMatKul = new MataKuliah[50];
        jumlahMatKul = 0;

        kendaraan = new Kendaraan(); // komposisi
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi,
                     String noPlat, String jenis) {

        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;

        listMatKul = new MataKuliah[50];
        jumlahMatKul = 0;

        // KOMPOSISI
        this.kendaraan = new Kendaraan(noPlat, jenis);
    }

    /*************** MUTATOR ***************/

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(String noPlat, String jenis){
        this.kendaraan = new Kendaraan(noPlat, jenis); // tetap komposisi
    }

    /*************** SELEKTOR ***************/

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    /*************** METHOD ***************/

    // tambah mata kuliah
    public void addMatKul(MataKuliah mk){
        if(jumlahMatKul < 50){
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    // jumlah mata kuliah
    public int getJumlahMatKul(){
        return jumlahMatKul;
    }

    // jumlah SKS
    public int getJumlahSKS(){

        int total = 0;

        for(int i=0;i<jumlahMatKul;i++){
            total += listMatKul[i].getSks();
        }

        return total;
    }

    // print data mahasiswa
    public void printMhs(){

        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);

    }

    // print detail mahasiswa
    public void printDetailMhs(){

        printMhs();

        System.out.println("\nDaftar Mata Kuliah:");

        for(int i=0;i<jumlahMatKul;i++){
            System.out.println("- " + listMatKul[i].getNamaMatkul());
        }

        System.out.println("\nJumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Jumlah SKS: " + getJumlahSKS());

        System.out.println("\nDosen Wali:");
        System.out.println(dosenWali.getNama());

        System.out.println("\nKendaraan:");
        System.out.println(kendaraan.getNoPlat() + " - " + kendaraan.getJenis());
    }
    
}
class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }
}

class MataKuliah{

    private String idMatkul;
    private String namaMatkul;
    private int sks;

    public MataKuliah(){
        idMatkul = "";
        namaMatkul = "";
        sks = 0;
    }

        public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setnamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setsks(int sks) {
        this.sks = sks;
    }

    public String getidMatkul() {
        return idMatkul;
    }

    public String getnamaMatkul() {
        return namaMatkul;
    }

    public int getsks() {
        return sks;
    }
}

class Kendaraan {

    private String noPlat;
    private String jenis;

    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }
}