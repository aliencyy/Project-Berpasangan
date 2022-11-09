/**
 * Class Pelanggan adalah class yang digunakan untuk pelanggan di Laundry
 * dimana class ini berisi nama pelanggan
 * 
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 08-11-2022
 */

public class Pelanggan {

    // inisialisasi atribut
    private static String nama;

    /**
     * method constructor tanpa parameter
     */
    public Pelanggan() {

    }

    /**
     * method mutator/setter
     * 
     * @param namaBaru
     */
    public void setNama(String namabaru) {
        this.nama = namabaru;
    }

    /**
     * method accessor/getter
     * 
     * @return nama
     */
    public String getNama() {
        return this.nama;
    }
}
