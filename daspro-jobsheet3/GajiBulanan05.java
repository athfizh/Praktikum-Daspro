import java.util.Scanner;
public class GajiBulanan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        short jumlahJamkerja;
        int upahPerjam;
        System.out.print("Masukkan jumlah jam kerja: ");
        jumlahJamkerja = sc.nextShort();
        System.out.print("Masukkan upah per jam: ");
        upahPerjam = sc.nextInt();

        int gajiKotorkaryawan;
        gajiKotorkaryawan = (jumlahJamkerja*upahPerjam);
        System.out.println("Total gaji kotor karyawan: " + gajiKotorkaryawan);

        float bonus = gajiKotorkaryawan * 0.1f;
        System.out.println("Total bonus karyawan: " + bonus);

        int gajiKotorSementara = (int) (gajiKotorkaryawan + bonus);
        System.out.println("Total gaji kotor + bonus: " + gajiKotorSementara);

        float pajak = gajiKotorSementara * 0.05f;
        System.out.println("Total pajak karyawan: " + pajak);

        double gajibersih = gajiKotorSementara - pajak;
        System.out.println("Total gaji bersih karyawan: " + gajibersih);
    }
}