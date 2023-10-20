/**
 * WhileKelipatan25
 */
import java.util.Scanner;
public class WhileKelipatan25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noAbsen = 1, kelipatan = 3; 

        System.out.println("Daftar Kelipatan : " + kelipatan + "No. Absen");

        while (noAbsen <= 20) {
            if (noAbsen % kelipatan == 0){
                System.out.println(noAbsen + " ");
            }
            noAbsen++;
        }
        System.out.println();
    }
}