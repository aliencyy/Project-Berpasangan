package Project_Berpasangan;

public abstract class Selimut extends paketLaundry {
    @Override
    public String Paket1(){
        return "mencuci";
    }

    @Override
    public String Paket2() {
        return "menggosok";
    }

    @Override
    public String Paket3() {
        return "mencuci dan menggosok";
    }

    @Override
    public double hargaPaket1() {
        return 6.000;
    }

    @Override
    public double hargaPaket2() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double hargaPaket3() {
        // TODO Auto-generated method stub
        return 0;
    }
}