import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.BeepAction;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean Ulang = true;
        Double num1, num2, Hasil;
        String operasi;
        String response;
        DecimalFormat df = new DecimalFormat("0.#");
        do {
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
            System.out.println("\t (T) = Table Perkalian");
            System.out.println("-------------------------------------------");
            System.out.print("Enter Here.... ");
            while(true) {
                operasi = scanner.nextLine();
                if (operasi.equals("-") || operasi.equals("+") || operasi.equals("x") || operasi.equals("/") || operasi.equals("^") || operasi.equals("t")) {
                    break;
                }
                else{
                    System.out.println("---------------------------");
                    System.out.println("  Pilihan Tidak Tersedia");
                    System.out.println("---------------------------");
                }
            }
            operasi = operasi.toUpperCase();
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
                case "X" :
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
                case "T" :
                for (int i= 1 ;i<=10;i++) {
                    System.out.println("------------------------");
                    for (int j= 1 ;j<=10;j++) {
                        System.out.println("\t"+i + " x " + j + " = " + i * j);
                    }
                    System.out.println("------------------------");
                    System.out.println();
                }
                break;
            }
            System.out.println("Apakah anda ingin melakukan perhitungan lagi? (Y/N)");
            while (true) {
                response = scanner.next();
                response = response.toUpperCase();
                if (response.equals("Y")) {
                    Ulang = true;
                    break;
                }
                else if (response.equals("N")){
                    Ulang = false;
                    System.out.println("Terima Kasih Telah Menggunakan Program ini.......");
                    break;
                }
                else{
                    System.out.println("---------------------------");
                    System.out.println("  Pilihan Tidak Tersedia");
                    System.out.println("---------------------------");
                }
            }
        }while (Ulang);

    }
}
