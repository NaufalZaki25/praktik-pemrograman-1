import java.util.Scanner;

public class Lulus_UNY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai Anda = ");
        double nilai = scanner.nextDouble();
        System.out.print("Masukan waktu kuliah = ");
        int waktu = scanner.nextInt();
        if (nilai <= 4.0 && nilai >= 3.51 && waktu <= 4) {
            System.out.println("Dengan pujian tertinggi, Anda summa cumlaude");
        } else if (nilai <= 4.0 && nilai >= 3.51 && waktu >= 4) {
            System.out.println("Dengan pujian, Anda cumlaude");
        } else if (nilai <= 3.50 && nilai >= 3.01 && waktu > 0) {
            System.out.println("Hasil Anda Sangat memuaskan");
        } else if (nilai <= 3.0 && nilai >= 2.76 && waktu > 0) {
            System.out.println("Hasil Anda memuaskan");
        } else if (nilai <= 2.75 && nilai >= 2.0 && waktu > 0) {
            System.out.println("Hasil Anda cukup");
        } else if (nilai <= 2.0 && nilai >= 0.00 && waktu > 0) {
            System.out.println("mohon maaf Anda tidak lulus");
        } else {
            System.out.println("hasil Anda tidak valid");
        }
    }
}