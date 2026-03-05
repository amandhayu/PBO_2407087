package latihan_pbo.latihan3_2407087;

public class Main {
    public static void main(String[] args) {
        Segitiga sTiga = new Segitiga();

        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas Segitiga adalah : " + sTiga.LuasSegitiga());

        Persegi persegi = new Persegi();
        persegi.setSisi(3);
        System.out.println("Luas Persegi Adalah : " + persegi.LuasPersegi());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(3);
        persegiPanjang.setLebar(2);
        persegiPanjang.setTinggi(1);
        System.out.println("Luas Persegi Panjang Adalah : " + persegiPanjang.LuasPersegiPanjang());

        
    }

}