import java.util.Scanner;
public class Pemilihan2Percobaan1No05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int tahun;
        System.out.print("Masukkan Tahun : ");
        tahun = input05.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}