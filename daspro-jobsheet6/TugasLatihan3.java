import java.util.Scanner;
public class TugasLatihan3 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String merek, kategori;
        byte ukuran;

        System.out.println("------------------------------------------------------------");
        System.out.println("=========================== MENU ===========================");
        System.out.println("------------------------------------------------------------");
        System.out.println("Merek (specs/910/ortus)");
        System.out.println("Kategori & Ukuran specs : slip on (36-40) / high top (40-44)");
        System.out.println("Kategori & Ukuran 910 : woman (36-41) / man (41-44)");
        System.out.println("Kategori & Ukuran ortus : kids (36-40) / adult (40-44)");

        System.out.println("Masukkan merek (specs/910/ortus) : ");
        merek = input05.nextLine();
        System.out.println("Masukkan kategori : ");
        kategori = input05.nextLine();
        System.out.println("Masukkan ukuran : ");
        ukuran = input05.nextByte();
        input05.nextLine();

        if (merek.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        System.out.println("800.000");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid");
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        System.out.println("1.200.000");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }

        } else if (merek.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        System.out.println("1.000.000");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid");
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        System.out.println("1.800.000");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }

            } else if (merek.equalsIgnoreCase("ortus")) {
                if (kategori.equalsIgnoreCase("kids")) {
                    if (ukuran >= 36) {
                        if (ukuran <= 40) {
                            System.out.println("750.000");
                        } else {
                            System.out.println("Invalid");
                        }
                    } else {
                        System.out.println("Invalid");
                    }
                } else if (kategori.equalsIgnoreCase("adult")) {
                    if (ukuran >= 40) {
                        if (ukuran <= 44) {
                            System.out.println("1.500.000");
                        } else {
                            System.out.println("Invalid");
                        }
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid"); 
                }

        } else {
        System.out.println("Invalid");

        }
    }
}