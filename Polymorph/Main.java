public class Main {
    public static void main(String[] args) {

        Mobil avanza = new Avanza("Sedan", 50000000);
        Mobil kijang = new Kijang("Pick up", 40000000);
        Mobil bmw = new BMW("Sport", 1000000000);

        Mobil[] mobil = {avanza,kijang,bmw};

        for(Mobil x : mobil) {
            System.out.println("--------------------------------------");
            x.inspect();
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }
}
