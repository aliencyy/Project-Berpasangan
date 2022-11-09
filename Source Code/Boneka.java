/**
 * CLass Boneka merupakan class turunan dari PaketLaundry (class abstract)
 * dimana class ini me-Override method dari class PaketLaundry
 * 
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 08-11-2022
 */

public class Boneka extends PaketLaundry {

    @Override
    public String Paket1() {
        return "Dry cleaning";
    }

    @Override
    public String Paket2() {
        return "Vakum";
    }

    @Override
    public String Paket3() {
        return "Dry cleaning dan Vakum";
    }

    @Override
    public double hargaPaket1() {
        return 15.000;
    }

    @Override
    public double hargaPaket2() {
        return 7.000;
    }

    @Override
    public double hargaPaket3() {
        return 20.000;
    }
}
