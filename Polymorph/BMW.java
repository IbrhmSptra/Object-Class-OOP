public class BMW extends Mobil {
    String merk = "BMW";
    int harga;

    BMW(String Model , int harga) {
        super(Model);  
        this.harga = harga;
    }
    void inspect() {
        System.out.println("Mobil " +super.Model);
        System.out.println("Merk : " + merk);
        System.out.println("harga = " + this.harga);
    }
}
