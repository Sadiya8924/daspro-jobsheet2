import java.util.Scanner;

public class Bank25{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentasi_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan anda : ");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menbaung anda : ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung*prosentasi_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("Jumlah tabungan terakhir anda adalah " + jml_tabungan_akhir);
    }
}