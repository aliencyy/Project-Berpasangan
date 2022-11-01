/**
 * CLass Pelanggan merupakan class yang berisikan inputan dari pelanggan,
 * antara lain nama pelanggan, kode pelanggan, no hp pelanggan, dan alamat pelanggan
 */

public class Pelanggan {
    
    // inisialisasi atribut
    private static String nama;
    private static int kodePelanggan;
    private static int noHp;
    private static String alamat;

    /**
     * method constructor tanpa parameter
     */
    public Pelanggan(){

    }

    /**
     * method mutator/setter
     * @param nama
     */
    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }

    /**
     * method accessor/getter
     * @return nama
     */
    public String getNama(){
        return this.nama;
    }
}
