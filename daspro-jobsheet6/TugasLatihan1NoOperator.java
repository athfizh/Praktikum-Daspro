import java.util.Scanner;

public class TugasLatihan1NoOperator {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("Masukkan bilangan 1 : ");
        bil1 = input05.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = input05.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        bil3 = input05.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah " + bil3);
            }
        }
    }
}