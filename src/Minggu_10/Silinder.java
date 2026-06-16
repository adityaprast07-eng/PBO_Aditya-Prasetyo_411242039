package Minggu_10;

import java.util.Scanner;

public class Silinder {

    // Atribut private (Enkapsulasi - data tersembunyi dari luar kelas)
    private double radius;
    private double tinggi;

    // Constructor
    public Silinder(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    // Getter - radius
    public double getRadius() {
        return radius;
    }

    // Setter - radius (dengan validasi)
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius harus bernilai positif!");
        }
    }

    // Getter - tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Setter - tinggi (dengan validasi)
    public void setTinggi(double tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            System.out.println("Tinggi harus bernilai positif!");
        }
    }

    // Method menghitung volume
    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }

    // Method menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("\n=============================");
        System.out.println("       HASIL PERHITUNGAN     ");
        System.out.println("=============================");
        System.out.printf("  Radius  : %.2f cm%n", radius);
        System.out.printf("  Tinggi  : %.2f cm%n", tinggi);
        System.out.println("-----------------------------");
        System.out.printf("  Volume  : %.2f cm³%n", hitungVolume());
        System.out.println("=============================");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("  KALKULATOR VOLUME SILINDER  ");
        System.out.println("  (Konsep Enkapsulasi - PBO)  ");
        System.out.println("==============================");

        System.out.print("Masukkan Radius (cm) : ");
        double r = scanner.nextDouble();

        System.out.print("Masukkan Tinggi (cm) : ");
        double t = scanner.nextDouble();

        // Membuat objek Silinder
        Silinder silinder = new Silinder(r, t);

        // Validasi ulang lewat setter (contoh penggunaan enkapsulasi)
        silinder.setRadius(r);
        silinder.setTinggi(t);

        // Tampilkan hasil
        silinder.tampilkanHasil();

        scanner.close();
    }
}