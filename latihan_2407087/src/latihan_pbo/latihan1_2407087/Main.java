package latihan_pbo.latihan1_2407087;

class Cafe{
    String nama;
    String alamat;

    //konstruktor
    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama Kafenya Adalah = "+ nama);
        System.out.println("Alamatnya di = "+ alamat);
    }

    //method
    void buka(){
        System.out.println("kafe sudah buka");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Cafe cafe1 = new Cafe("Halaman", "Indramayu");
        cafe1.buka();
        Cafe cafe2 = new Cafe("Teringat Kopi", "Sindang");
        cafe2.buka();
        Cafe cafe3 = new Cafe("Kopi Kenangan", "Indramayu");
        cafe3.buka();
}
}
