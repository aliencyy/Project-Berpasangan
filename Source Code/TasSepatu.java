package Project_Berpasangan;

/**
 * CLass TasSepatu merupakan
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 01-11-2022
 */

public class TasSepatu extends PaketLaundry{
    @Override
    public String Paket1(){
        return "Dry cleaning";
    }

    @Override
    public String Paket2() {
        return "Vakum";
    }

    @Override
    public String Paket3() {
        return "Dry cleaning dan vakum";
    }

    @Override
    public double hargaPaket1() {
        return 15.000;
    }

    @Override
    public double hargaPaket2() {
        return 10.000;
    }

    @Override
    public double hargaPaket3() {
        return 20.000;
    }
    
}

