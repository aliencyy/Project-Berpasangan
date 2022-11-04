public class Boneka extends PaketLaundry{
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
        return "Dry cleaning dan Vakum";
    }

    @Override
    public double hargaPaket1() {
        return 15.000;
    }

    @Override
    public double hargaPaket2() {
        // TODO Auto-generated method stub
        return 10.000;
    }

    @Override
    public double hargaPaket3() {
        // TODO Auto-generated method stub
        return 20.000;
    }
}
