package tugas.tugas3_2407087;

public class Main {
    public static void main(String[] args) {

        // Menggunakan satu tipe variabel (polymorphism)
        BangunDatar bd;

        bd = new Persegi(5);
        bd.tampilkan();

        bd = new PersegiPanjang(6, 4);
        bd.tampilkan();

        bd = new Segitiga(8, 3);
        bd.tampilkan();
    }
}