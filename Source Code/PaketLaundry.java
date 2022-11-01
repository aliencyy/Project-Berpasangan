/**
 * 
 */

public abstract class PaketLaundry {
    
    // inisialisasi atribut
    protected String namaPelanggan = "";
    public abstract String Paket1(); // mencuci
    public abstract String Paket2(); // menggosok
    public abstract String Paket3(); // menggosok + mencuci

    public abstract double hargaPaket1(); // harga paket 1
    public abstract double hargaPaket2(); // harga paket 2
    public abstract double hargaPaket3(); // harga paket 3

}
