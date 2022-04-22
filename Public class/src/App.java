class Produk {
    String Nama;
    int Exp;
    int Kuantiti;
}

public class App {
    public static void main(String[] args) throws Exception {
        Produk Supermarket = new Produk();
        Supermarket.Nama = "Teh Kotak";
        Supermarket.Exp = 2024;
        Supermarket.Kuantiti = 4;
        System.out.println("Nama Produk :" + Supermarket.Nama);
        System.out.println("Exp Produk  :" + Supermarket.Exp);
        System.out.println("Kuantiti    :" + Supermarket.Kuantiti);

    }
}
