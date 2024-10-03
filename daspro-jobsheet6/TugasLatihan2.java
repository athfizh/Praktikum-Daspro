import java.util.Scanner;
public class TugasLatihan2 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;

        System.out.print("Masukkan Jenis Buku (kamus/novel/buku lain) : ");
        jenisBuku = input05.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = input05.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku > 2) {
            System.out.println("Diskon 12%");
        } else if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku <= 2) {
            System.out.println("Diskon 10%");
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            System.out.println("Diskon 9%");
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku <= 3) {
            System.out.println("Diskon 8%");
        } else if (jenisBuku.equalsIgnoreCase("buku lain") && jumlahBuku > 3) {
            System.out.println("Diskon 5%");
        } else if (jenisBuku.equalsIgnoreCase("buku lain") && jumlahBuku <= 3) {
            System.out.println("Diskon 0%");
        } else {
            System.out.println("Invalid");
    
        }
    }
}