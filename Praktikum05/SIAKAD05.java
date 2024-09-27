import java.util.Scanner;

public class SIAKAD05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        double bobotKuis = 0.20;
        double bobotTugas = 0.15;
        double bobotUjian = 0.65;

        String nilaiHuruf, nilaiKualifikasi;
        
        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis*bobotKuis) + (nilaiTugas*bobotTugas) + (nilaiUjian*bobotUjian);
        nilaiHuruf = ( (nilaiAkhir >= 80) ? "A" : ( (nilaiAkhir >= 73) ? "B+" : ( (nilaiAkhir >= 65) ? "B" : (nilaiAkhir >= 60) ? "C+" : ( (nilaiAkhir >= 50) ? "C" : ( (nilaiAkhir >= 39) ? "D" : ( (nilaiAkhir <= 39) ? "D" : "E" ) ) )) ) );
        nilaiKualifikasi = ( (nilaiAkhir >= 80) ? "Sangat baik" : ( (nilaiAkhir >= 73) ? "Lebih dari baik" : ( (nilaiAkhir >= 65) ? "Baik" : (nilaiAkhir >= 60) ? "Lebih dari cukup" : ( (nilaiAkhir >= 50) ? "Cukup" : ( (nilaiAkhir >= 39) ? "Kurang" : ( (nilaiAkhir <= 39) ? "Kurang" : "Gagal" ) ) )) ) );

        System.out.println("Mahasiswa dengan nama " + nama + " (" +"NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Nilai kualifikasi: " + nilaiKualifikasi);    
    }
}