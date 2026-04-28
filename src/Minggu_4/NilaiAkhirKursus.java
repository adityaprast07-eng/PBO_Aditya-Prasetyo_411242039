package Minggu_4;

import java.util.Scanner;

public class NilaiAkhirKursus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Layar Masukan
        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        
        System.out.print("Nama Siswa \t: ");
        String namaSiswa = input.nextLine();
        
        System.out.print("Nilai Keaktifan : ");
        double nilaiKeaktifan = input.nextDouble();
        
        System.out.print("Nilai Tugas \t: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai Ujian \t: ");
        double nilaiUjian = input.nextDouble();

        // Proses Perhitungan Nilai Murni
        double murniKeaktifan = nilaiKeaktifan * 0.20;
        double murniTugas = nilaiTugas * 0.30;
        double murniUjian = nilaiUjian * 0.50;

        // Total Nilai Akhir
        double nilaiAkhir = murniKeaktifan + murniTugas + murniUjian;

        // Penentuan Grade
        char grade;
        if (nilaiAkhir >= 80) {
            grade = 'A';
        } else if (nilaiAkhir >= 70) {
            grade = 'B';
        } else if (nilaiAkhir >= 59) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Layar Keluaran
        System.out.println("\nSiswa yang bernama " + namaSiswa);
        System.out.println("Dengan Nilai Persentase Yang dihasilkan.");
        System.out.println("Nilai Keaktifan * 20% \t: " + murniKeaktifan);
        System.out.println("Nilai Tugas     * 30% \t: " + murniTugas);
        System.out.println("Nilai Ujian     * 50% \t: " + murniUjian);
        
        System.out.println("\nJadi Siswa yang bernama " + namaSiswa + " memperoleh nilai akhir sebesar " + nilaiAkhir);
        System.out.println("Grade nilai yang didapat adalah " + grade);

        input.close();
    }
}