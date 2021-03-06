
package latihan;

import latihan.satu.*;
import latihan.dua.*;
import java.util.Scanner;

public class App {

    public static void pilihDua() {
        int pilihan, angka1, angka2;
        Scanner scan = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Tutorial di Jenkov.com");
        System.out.println("=================================");
        System.out.println("[1] Array Exists");
        System.out.println("[2] Array filter");
        System.out.println("[3] Array Fold Left");
        System.out.println("[4] Array For All");
        System.out.println("[5] Array Map");
        System.out.println("[6] List Map");
        System.out.println("[7] Option Bind");
        System.out.println("[8] Option Filter");
        System.out.println("[9] Option Map");
        System.out.println("[10] IO");
        System.out.println("[11] Back");
        System.out.println("[0] Exit");
        System.out.println("Masukkan pilihan Anda : ");
        pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                Array_exists.mulai();
                pilihDua();
                break;
            case 2:
                Array_filter.mulai();
                pilihDua();
                break;
            case 3:
                Array_foldLeft.mulai();
                pilihDua();
                break;
            case 4:
                Array_forall.mulai();
                pilihDua();
                break;
            case 5:
                Array_map.mulai();
                pilihDua();
                break;
            case 6:
                List_map.mulai();
                pilihDua();
                break;
            case 7:
                Option_bind.mulai();
                pilihDua();
                break;
            case 8:
                Option_filter.mulai();
                pilihDua();
                break;
            case 9:
                Option_map.mulai();
                pilihDua();
                break;
            case 11:
                mainMenu();
                break;
            case 0:
                System.out.println("Terima Kasih");
                System.exit(0);
            default:
                System.out.println("Angka yang Anda masukkan tidak valid");
                mainMenu();
                break;
        }
    }

    public static void pilihSatu() {
        int pilihan, angka1, angka2;
        Scanner scan = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Tutorial di Jenkov.com");
        System.out.println("=================================");
        System.out.println("[1] Pure Functions");
        System.out.println("[2] Higher Order Functions");
        System.out.println("[3] Functional Interfaces");
        System.out.println("[3] No State");
        System.out.println("[3] No State");
        System.out.println("[3] No State");
        System.out.println("[3] No State");
        System.out.println("[3] No State");
        System.out.println("[3] No State");
        System.out.println("[3] No State");
        System.out.println("[9] Back");
        System.out.println("[0] No State");
        System.out.println("Masukkan pilihan Anda : ");
        pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan angka pertama");
                angka1 = scan.nextInt();
                System.out.println("Masukkan angka kedua");
                angka2 = scan.nextInt();
                ObjectWithPureFunction o1 = new ObjectWithPureFunction();
                System.out.println(o1.sum(angka1, angka2));
                pilihSatu();
                break;
            case 2:
                HigherOrderFunction o2 = new HigherOrderFunction();
                o2.mulai();
                pilihSatu();
                break;
            case 3:
                FunctionExample o3 = new FunctionExample();
                o3.mulai();
                pilihSatu();
                break;
            case 4:
                System.exit(0);
                break;
            case 9:
                mainMenu();
                break;
            case 0:
                System.out.println("Terima Kasih");
                System.exit(0);
                break;
            default:
                System.out.println("Angka yang Anda masukkan tidak valid");
                mainMenu();
                break;
        }
    }

    public static void mainMenu() {
        int pilihan;
        Scanner scan = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Latihan minggku ke-2 hari pertama");
        System.out.println("=================================");
        System.out.println("[1] Tutorial di Jenkov.com");
        System.out.println("[2] Java 8 Examples - Functional Java");
        System.out.println("[0] Exit");
        System.out.println("Masukkan pilihan Anda : ");
        pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                pilihSatu();
                break;
            case 2:
                pilihDua();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Angka yang Anda masukkan tidak valid");
                mainMenu();
                break;
        }

    }

    public static void main(String[] args) {
        mainMenu();
    }
}