package Minggu_11.BangunDatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input keyboard
        Scanner input = new Scanner(System.in);
        
        // Membuat objek Lingkaran dari package bangundatar
        Lingkaran bundar = new Lingkaran();

        System.out.println("====== PROGRAM LINGKARAN (PACKAGE & ENKAPSULASI) ======");
        
        // Nilai Radius diinput dari main method
        System.out.print("Masukkan Nilai Radius (Jari-jari): ");
        double r = input.nextDouble();
        
        // Memasukkan hasil input ke objek Lingkaran menggunakan Setter
        bundar.setRadius(r);

        System.out.println("-------------------------------------------------------");
        
        // Menampilkan hasil kalkulasi dengan format 2 angka di belakang koma (%.2f)
        System.out.printf("Radius yang dimasukkan : %.2f\n", bundar.getRadius());
        System.out.printf("LUAS LINGKARAN          : %.2f\n", bundar.hitungLuas());
        System.out.printf("KELILING LINGKARAN      : %.2f\n", bundar.hitungKeliling());
        
        System.out.println("=======================================================");
        
        // Menutup scanner
        input.close();
    }
}
