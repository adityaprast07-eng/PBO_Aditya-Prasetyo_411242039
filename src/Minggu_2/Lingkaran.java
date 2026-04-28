package Minggu_2;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Konstanta untuk nilai PI
        final double PI = 3.14159;

        // Tampilan Masukan
        System.out.print("Masukan Nilai Radius \t: ");
        double radius = input.nextDouble();

        // Proses Perhitungan
        double luas = PI * radius * radius;
        double keliling = 2 * PI * radius;

        // Tampilan Keluaran
        System.out.println("Hasil Perhitungan");
        System.out.println("Luas Lingkaran \t\t: " + luas);
        System.out.println("Keliling Lingkaran \t: " + keliling);

        input.close();
    }
}