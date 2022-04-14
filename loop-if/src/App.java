import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Double num1, num2, Hasil;
        String operasi;
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.println("---------------------------------------------");
        System.out.println("                 KALKULATOR");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.print("Masukan Angka Pertama :");
        num1 = scanner.nextDouble();
        System.out.println();
        System.out.print("Masukan Angka Kedua :");
        num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println("Pilih Operasi Yang Diinginkan :");
        System.out.println("\t (-) = Pengurangan");
        System.out.println("\t (+) = Penjumlahan");
        System.out.println("\t (x) = Perkalian");
        System.out.println("\t (/) = Pembagian");
        System.out.println("\t (^) = Pemangkatan");
        System.out.println("-------------------------------------------");
        System.out.print("Enter Here.... ");
        while(true) {
            operasi = scanner.nextLine();
            if (operasi.equals("-") || operasi.equals("+") || operasi.equals("x") || operasi.equals("/") || operasi.equals("^")) {
                break;
            }
            else{
                System.out.println("---------------------------");
                System.out.println("  Pilihan Tidak Tersedia");
                System.out.println("---------------------------");
            }
        }
        switch (operasi) {
            case "-" :
            Hasil = num1-num2;
            System.out.println("-------------------------------------------");
            System.out.println("Hasil "  +df.format(num1) + " - " + df.format(num2) + " = " + df.format(Hasil));
            System.out.println("-------------------------------------------");
            break;
            case "+" :
            Hasil = num1+num2;
            System.out.println("-------------------------------------------");
            System.out.println("Hasil "  +df.format(num1) + " + " + df.format(num2) + " = " + df.format(Hasil));
            System.out.println("-------------------------------------------");
            break;
            case "x" :
            Hasil = num1*num2;
            System.out.println("-------------------------------------------");
            System.out.println("Hasil "  +df.format(num1) + " x " + df.format(num2) + " = " + df.format(Hasil));
            System.out.println("-------------------------------------------");
            break;
            case "/" :
            Hasil = num1/num2;
            System.out.println("-------------------------------------------");
            System.out.println("Hasil "  +df.format(num1) + " / " + df.format(num2) + " = " + df.format(Hasil));
            System.out.println("-------------------------------------------");
            break;
            case "^" :
            Hasil = Math.pow(num1, num2);
            System.out.println("-------------------------------------------");
            System.out.println("Hasil " +df.format(num1) + " Pangkat " + df.format(num2) + " = " + df.format(Hasil));
            System.out.println("-------------------------------------------");
            break;

        }

    }
}
