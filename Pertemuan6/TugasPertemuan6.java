import java.util.Scanner;

public class TugasPertemuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai maksimal deret akan berada di bawah=");
        int n = scanner.nextInt();

        int i = 0;
        int x = 0;
        while (i != n) {
            if (i == Math.pow(5, x)) {
                System.out.println(i);
                x++;
    
            }
            i++;
        }
    }
}