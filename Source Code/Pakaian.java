/**
 * CLass Pakaian merupakan class turunan dari PaketLaundry (class abstract)
 * dimana class ini me-Override method dari class PaketLaundry
 * 
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 08-11-2022
 */

public class Pakaian extends PaketLaundry {

    @Override
    public String Paket1() {
        return "Mencuci";
    }

    @Override
    public String Paket2() {
        return "Menggosok";
    }

    @Override
    public String Paket3() {
        return "Mencuci dan menggosok";
    }

    @Override
    public double hargaPaket1() {
        return 4.000;
    }

    @Override
    public double hargaPaket2() {
        return 4.000;
    }

    @Override
    public double hargaPaket3() {
        return 6.000;
    }
}
