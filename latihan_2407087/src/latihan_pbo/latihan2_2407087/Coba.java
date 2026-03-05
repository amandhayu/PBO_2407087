package latihan_pbo.latihan2_2407087;

public class Coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getPanjang(){
        return panjang;
    }

    public void setLebar(double Lebar){
        this.lebar = Lebar;
    }

    public void cetakLuas(){
        System.out.println("Luasnya adalah : "+ (panjang * lebar));
    }

    public double hitungLuas(){
        double Luas = panjang * lebar;
        return Luas;
    }
     
}
