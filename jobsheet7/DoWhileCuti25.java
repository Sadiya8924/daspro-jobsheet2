/**
 * DoWhileCuti25
 */
import java.util.Scanner;
public class DoWhileCuti25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/n)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");

                    while (true) {
                        System.out.println("Masukkan jumlah hari yang sesuai: ");
                        int tambahanHari = sc.nextInt();
                        if (tambahanHari <= jatahCuti) {
                            jatahCuti -= tambahanHari;
                            System.out.println("Sisa jatah cuti: " + jatahCuti);
                            break;
                        }
                    }
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        } while (jatahCuti > 0);
        
    }
}