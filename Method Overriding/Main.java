import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int Response;
        Menu menu = new Menu();
        Exit exit = new Exit();
        System.out.println("--------------------------------------------------------------");
        System.out.println("              Apakah Anda Ingin Keluar Dari Program?");
        System.err.println("--------------------------------------------------------------");
        System.out.println("");
        System.out.println("                            1. Iya");
        System.out.println("                            2. Tidak");
        System.out.println("--------------------------------------------------------------");
        System.out.print("Enter Here..... ");
        Response = scaner.nextInt();
        while(true) {
            if (Response==1 || Response==2) {
                break;
            }
            else {
                System.out.println("---------------------------------");
                System.out.println("   Pilihan Tidak Tersedia !!!!");
                System.out.println("---------------------------------");
                System.out.print("Enter Here..... ");
                Response = scaner.nextInt();
            }
        }
        if (Response == 1) {
            exit.UI();
        }
        else if (Response == 2) {
            menu.UI();
        }
    }
}
