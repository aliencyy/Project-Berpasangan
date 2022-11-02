package Project_Berpasangan;

public abstract class Selimut extends paketLaundry {
    @Override
    public String Paket1(){
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
        return 6.000;
    }

    @Override
    public double hargaPaket2() {
        return 10.000;
    }

    @Override
    public double hargaPaket3() {
        return 15.000;
    }
}
