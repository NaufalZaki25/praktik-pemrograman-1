import java.util.Scanner; 

public class TugasPertemuan8 {
    public static void main(String[] args) {

            String[] nama = new String[1000];
            double[] ipk = new double[1000];

            for (int i = 1; i < 1000; i++){
                Scanner scan = new Scanner (System.in);

                System.out.println("Data ke - " + i);
                System.out.print("Nama Mahasiswa : ");
                String inputNama = scan.nextLine();
                System.out.print("IPK Mahasiswa : ");
                double inputIPK = scan.nextDouble();
                
                if (inputNama.equals("exit")) {
                    break;
                } else {
                    nama[i] = inputNama;
                    ipk[i] = inputIPK;
                }
            }
            

            System.out.println("No" + "\t"  + "Nama" + "\t\t\t\t" + "IPK");

            for (int i = 1; i<nama.length; i++) { 
                if (nama[i].equals("exit")) {
                    break;
                } else {
                System.out.println(i + "\t" + nama[i] + "\t\t\t\t" + ipk[i]);
                }
            }
        }
    }
