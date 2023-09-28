/**
 * ContohVariable25
 */
public class ContohVariable25 {

    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain Petak Umpet";
        boolean Pandai = true;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 19;
        double ipk = 3.24, tinggi = 1.50;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis Kelamin: "+ jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}