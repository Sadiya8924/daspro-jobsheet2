/**
 * BioskopWithScanner24
 */
import java.util.Scanner;
public class BioskopWithScanner24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        while (true){
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = sc.nextInt();

            penonton[baris-1][kolom-1] = nama;

            sc.nextLine();
            System.out.print("input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}