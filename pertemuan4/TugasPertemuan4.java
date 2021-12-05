import java.util.Scanner;

public class TugasPertemuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka input = ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukan angka input = ");
        int angka2 = scanner.nextInt();
        
        System.out.println("hasil penjumlahan : " + angka1 + angka2 );
        System.out.println("hasil pengurangan : " + (angka1 - angka2) );
        System.out.println("hasil perkalian : " + angka1 * angka2 );
        System.out.println("hasil pembagian : " + angka1 / angka2 );
        System.out.println("hasil modulus : " + angka1 % angka2 );
   }
}