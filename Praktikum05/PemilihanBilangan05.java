import java.util.Scanner;

public class PemilihanBilangan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka %2 == 0) ? " Bilangan positif" : " Bilangan negatif";
        System.out.println(angka + " adalah " + hasil);
    
    }
}