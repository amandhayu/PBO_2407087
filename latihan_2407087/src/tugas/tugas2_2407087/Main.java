package tugas.tugas2_2407087;

public class Main {
    public static void main(String[] args) {
        // data sesuai soal
        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        // membuat objek
        BangunRuang bangun = new BangunRuang(panjang, lebar, tinggi);

        // output
        System.out.println("Luas alas: " + bangun.hitungLuas());
        System.out.println("Volume: " + bangun.hitungVolume());
    }
}