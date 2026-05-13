/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
/**
 *
 * @author
 */

/**
 * Program.java (program)
 * Kelas ini sebagai program utama untuk mensimulasikan CRUD.
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("");

        // === insert
        System.out.println("===insert");
        // Membuat objek mahasiswa baru untuk ditambahkan
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // === update
        System.out.println("===update");
        // Mengambil data berdasarkan ID untuk diupdate
        Mahasiswa mhsUpdate = service.getById(1);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        
        // Mengubah nama pada objek
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        
        // Menyimpan perubahan ke database
        service.update(mhsUpdate);
        displayAll();

        // === delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(1));
        service.delete(1);
        displayAll();
    }

    /**
     * Method bantuan untuk menampilkan semua data mahasiswa (displayAll)
     */
    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
        System.out.println("");
    }
}