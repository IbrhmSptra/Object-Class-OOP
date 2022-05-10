public class Avanza extends Mobil{
    String merk = "Avanza";
    int harga;

    Avanza(String Model , int harga) {
        super(Model);  
        this.harga = harga;
    }
    void inspect() {
        System.out.println("Mobil " +super.Model);
        System.out.println("Merk : " + merk);
        System.out.println("harga = " + this.harga);
    }
}
