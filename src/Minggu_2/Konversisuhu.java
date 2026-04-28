package Minggu_2;
import java.util.Scanner;

public class Konversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukan Nilai Derajat Celcius : ");
        double celcius = input.nextDouble();

        // Proses konversi
        double fahrenheit = (celcius * 9/5) + 32;
        double reamur = celcius * 4/5;

        // Output
        System.out.println("Hasil Konversi :");
        System.out.println("Derajat Fahrenheit : " + fahrenheit);
        System.out.println("Derajat Reamur : " + reamur);

        input.close();
    }
}
