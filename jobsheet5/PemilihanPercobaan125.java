/**
 * PemilihanPercobaan125
 */
import java.util.Scanner;
public class PemilihanPercobaan125 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input25.nextInt();

        String hasil;
        hasil = (angka %2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(angka+ "adalah" +hasil);

    }
}
