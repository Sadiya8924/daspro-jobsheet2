/**
 * PemilihanPecobaan225
 */
import java.util.Scanner;
public class PemilihanPecobaan225 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.print("Nilai uas   : ");
        float uas = input25.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input25.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input25.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input25.nextFloat();
        float total = (uas * 04F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

    }
}