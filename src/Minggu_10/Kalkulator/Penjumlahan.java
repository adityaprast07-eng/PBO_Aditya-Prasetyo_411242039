package Minggu_10.Kalkulator;

import java.util.Scanner;

public class Penjumlahan {

    // Atribut private (Enkapsulasi)
    private double nilaiSatu;
    private double nilaiDua;

    // Constructor
    public Penjumlahan(double nilaiSatu, double nilaiDua) {
        this.nilaiSatu = nilaiSatu;
        this.nilaiDua = nilaiDua;
    }

    // Getter & Setter
    public double getNilaiSatu() { return nilaiSatu; }
    public void setNilaiSatu(double nilaiSatu) { this.nilaiSatu = nilaiSatu; }

    public double getNilaiDua() { return nilaiDua; }
    public void setNilaiDua(double nilaiDua) { this.nilaiDua = nilaiDua; }

    // Method hitung
    public double hitung() {
        return nilaiSatu + nilaiDua;
    }

    // Method tampil
    public void tampilkanHasil() {
        System.out.println("=============================");
        System.out.println("         PENJUMLAHAN         ");
        System.out.println("=============================");
        System.out.printf("  Nilai Satu : %.2f%n", nilaiSatu);
        System.out.printf("  Nilai Dua  : %.2f%n", nilaiDua);
        System.out.println("-----------------------------");
        System.out.printf("  Hasil      : %.2f%n", hitung());
        System.out.println("=============================");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("         PENJUMLAHAN          ");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Satu : ");
        double nilaiSatu = scanner.nextDouble();

        System.out.print("Masukkan Nilai Dua  : ");
        double nilaiDua = scanner.nextDouble();

        Penjumlahan p = new Penjumlahan(nilaiSatu, nilaiDua);
        p.tampilkanHasil();

        scanner.close();
    }
}

