import java.util.Scanner;
public class Pemilihan2Percobaan2No05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int pilihan_menu;
        String member, jenis_pembayaran;
        double diskon, harga, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input05.nextInt();
        input05.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input05.nextLine();
        System.out.print("Jenis pembayaran QRIS (y/n) ? = ");
        jenis_pembayaran = input05.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

                if (jenis_pembayaran.equalsIgnoreCase("y")) {
                total_bayar = total_bayar - 1000;
                System.out.println("Total bayar pakai QRIS = " + total_bayar);
                } else if (jenis_pembayaran.equalsIgnoreCase("n")) {
                System.out.println("Total bayar = " + total_bayar);
                } else {
                System.out.println("Pembayaran tidak valid");
                }
        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);

                if (jenis_pembayaran.equalsIgnoreCase("y")) {
                harga = harga - 1000;
                System.out.println("Total bayar pakai QRIS = " + harga);
                } else if (jenis_pembayaran.equalsIgnoreCase("n")) {
                    System.out.println("Harga tersebut tanpa QRIS");
                } else {
                System.out.println("Pembayaran tidak valid");
                }

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("--------------------------------------");
    }
}