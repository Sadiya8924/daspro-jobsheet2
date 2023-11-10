import java.util.Scanner;

/**
 * tugas1
 */
public class tugas1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int k = 1;
        
        for (int i = 1; i <= N; i++){
            for (int j = N; j > i; j--){
                System.out.print(" ");
            }
            for (k = 1; k <= i ; k++){
            System.out.print(k);
            }
            System.out.println();
        }
    }
}