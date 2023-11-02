/**
 * ArrayRataNilai24
 */
import java.util.Scanner;
public class ArrayRataNilai24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        double rataLulus = 0;
        double rataTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            } else {
                rataTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            } 
        }

        if (jumlahLulus > 0) {
            rataLulus /= jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rataTidakLulus /= jumlahTidakLulus;
        }

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumlahTidakLulus);
        if (jumlahLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        }
        if (jumlahTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        }
    }
}