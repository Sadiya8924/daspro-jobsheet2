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
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String hasil; 
        if (total > 80) {
            hasil = "A";
        }else if (total > 73 && total <= 80) {
            hasil = "B+";
        }else if (total > 65 && total <= 73) {
            hasil= "B";
        }else if (total > 60 && total <= 65){
            hasil = "C+";
        }else if (total > 50 && total <= 60){
            hasil = "C";
        }else if (total > 39 && total <= 50){
            hasil = "D";
        }else {
            hasil = "E";
        }
        
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + hasil + " sehingga " + message);

    }
}
