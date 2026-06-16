package Minggu_10.Kalkulator;

import java.util.Scanner;

public class Pembagian {

    // Atribut private (Enkapsulasi)
    private double nilaiSatu;
    private double nilaiDua;

    // Constructor
    public Pembagian(double nilaiSatu, double nilaiDua) {
        this.nilaiSatu = nilaiSatu;
        this.nilaiDua = nilaiDua;
    }

    // Getter & Setter
    public double getNilaiSatu() { return nilaiSatu; }
    public void setNilaiSatu(double nilaiSatu) { this.nilaiSatu = nilaiSatu; }

    public double getNilaiDua() { return nilaiDua; }
    public void setNilaiDua(double nilaiDua) { this.nilaiDua = nilaiDua; }

    // Method hitung (dengan validasi pembagian nol)
    public double hitung() {
        if (nilaiDua == 0) {
            System.out.println("  Error: Tidak bisa dibagi nol!");
            return 0;
        }
        return nilaiSatu / nilaiDua;
    }

    // Method tampil
    public void tampilkanHasil() {
        System.out.println("=============================");
        System.out.println("          PEMBAGIAN          ");
        System.out.println("=============================");
        System.out.printf("  Nilai Satu : %.2f%n", nilaiSatu);
        System.out.printf("  Nilai Dua  : %.2f%n", nilaiDua);
        System.out.println("-----------------------------");
        if (nilaiDua == 0) {
            System.out.println("  Hasil      : Error (bagi nol)");
        } else {
            System.out.printf("  Hasil      : %.2f%n", hitung());
        }
        System.out.println("=============================");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("          PEMBAGIAN           ");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Satu : ");
        double nilaiSatu = scanner.nextDouble();

        System.out.print("Masukkan Nilai Dua  : ");
        double nilaiDua = scanner.nextDouble();

        Pembagian b = new Pembagian(nilaiSatu, nilaiDua);
        b.tampilkanHasil();

        scanner.close();
    }
}
