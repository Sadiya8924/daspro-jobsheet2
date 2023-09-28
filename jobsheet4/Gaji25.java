/**
 * Gaji25
 */
import java.util.Scanner;

public class Gaji25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji, gaji,potGaji;

        System.out.println("Masukkan Jumlah Hari Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Kerja Anda ");
        jmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan Gaji Anda ");
        gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji=input.nextInt();
        
        TotGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
}