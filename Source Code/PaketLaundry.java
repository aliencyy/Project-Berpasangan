/**
 * CLass PaketLaundry merupakan class abstract
 * 
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 08-11-2022
 */

public abstract class PaketLaundry {
    
    // inisialisasi atribut
    public abstract String Paket1(); // mencuci
    public abstract String Paket2(); // menggosok
    public abstract String Paket3(); // menggosok + mencuci

    public abstract double hargaPaket1(); // harga paket 1
    public abstract double hargaPaket2(); // harga paket 2
    public abstract double hargaPaket3(); // harga paket 3

}
