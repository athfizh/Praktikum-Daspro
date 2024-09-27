import java.util.Scanner;
public class TagihanListrik05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifPerkwh = 1500;
        System.out.print("Masukkan penggunaan listrik dalam kWh: ");
        int penggunaanListrik = sc.nextInt();

        int totalTagihan = penggunaanListrik * tarifPerkwh;
        System.out.println("Total tagihan listrik : Rp " + totalTagihan);

        boolean informasi = penggunaanListrik > 500;
        System.out.print("Penggunaan listrik melebihi 500 kWh : " + informasi);
    }
}