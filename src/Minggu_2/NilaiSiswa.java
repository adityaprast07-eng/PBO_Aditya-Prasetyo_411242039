package Minggu_2;

import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Data
        System.out.print("Masukan Nama Siswa \t\t: ");
        String nama = input.nextLine();

        System.out.print("Nilai UTS \t\t\t: ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS \t\t\t: ");
        double uas = input.nextDouble();

        System.out.print("Nilai Tugas Mandiri \t\t: ");
        double tugas = input.nextDouble();

        // Menghitung Nilai Murni (Sesuai Persentase)
        double murniUTS = uts * 0.35;   // 35%
        double murniUAS = uas * 0.45;   // 45%
        double murniTugas = tugas * 0.20; // 20%

        // Menghitung Nilai Akhir (Total Nilai Murni)
        double nilaiAkhir = murniUTS + murniUAS + murniTugas;

        // Tampilan Keluaran
        System.out.println("\nNilai Murni yang diperoleh :");
        System.out.println("Nilai Murni UTS \t\t: " + murniUTS);
        System.out.println("Nilai Murni UAS \t\t: " + murniUAS);
        System.out.println("Nilai Murni Tugas \t\t: " + murniTugas);
        
        System.out.println("Nilai Akhir yang diperoleh yaitu : " + nilaiAkhir);

        input.close();
    }
}