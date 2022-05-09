import java.util.Scanner;

public class Inheritence {
    public static void main(String[] args) {
        Login Daftar = new Login();
        Scanner scanner = new Scanner(System.in);
        Homescreen Home = new Homescreen();
        System.out.println("------------------------------------------------------");
        System.out.println("                     Daftar Akun");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukan Username : ");
        Daftar.Username = scanner.nextLine();
        System.out.print("Masukan Password : ");
        Daftar.Password = scanner.nextLine();
        Home.Daftar();

        System.out.println("------------------------------------------------------");
        System.out.println("                         Login");
        System.out.println("------------------------------------------------------");
        System.out.print("   Username : ");
        Daftar.Username1 = scanner.nextLine();
        System.out.print("   Password : ");
        Daftar.Password1 = scanner.nextLine();
        if(Daftar.Username1.equals(Daftar.Username) && Daftar.Password.equals(Daftar.Password1)) {
            Home.Menu();
            Home.Ver();
        }
        else{
            Home.salah();
        }
    }
}