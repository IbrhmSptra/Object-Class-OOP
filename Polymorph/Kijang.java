public class Kijang extends Mobil {
    String merk = "Kijang";
    int harga;

    Kijang(String Model , int harga) {
        super(Model);  
        this.harga = harga;
    }
    void inspect() {
        System.out.println("Mobil " +super.Model);
        System.out.println("Merk : " + merk);
        System.out.println("harga = " + this.harga);
    }
}
