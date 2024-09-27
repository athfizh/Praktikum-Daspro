import java.util.Scanner;

class Beras05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short bantuanBeras;
        System.out.print("Masukkan bantuan beras (kuintal) : ");
        bantuanBeras = sc.nextShort();

        short jumlahKk;
        System.out.print("Masukkan jumlah keluarga (KK) : ");
        jumlahKk = sc.nextShort();

        float berasDiterima = (float) bantuanBeras / jumlahKk;
        System.out.print("Bantuan beras yang diterima per keluarga (kuintal) : " + berasDiterima);
    }
}