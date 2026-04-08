package tugas.tugas2_2407087;

public class BangunDatar {
    // a & b: atribut dengan enkapsulasi (private)
    private int panjang;
    private int lebar;

    // c: constructor
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter (opsional tapi bagian dari enkapsulasi yang baik)
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // d: method hitungLuas
    public int hitungLuas() {
        return panjang * lebar;
    }
}
