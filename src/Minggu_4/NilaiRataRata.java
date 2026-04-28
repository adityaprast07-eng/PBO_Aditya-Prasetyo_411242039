package Minggu_4;

import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Layar Masukan
        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");
        
        System.out.print("Nama Siswa \t\t: ");
        String namaSiswa = input.nextLine();
        
        System.out.print("Nilai Pertandingan I \t: ");
        double nilai1 = input.nextDouble();
        
        System.out.print("Nilai Pertandingan II \t: ");
        double nilai2 = input.nextDouble();
        
        System.out.print("Nilai Pertandingan III : ");
        double nilai3 = input.nextDouble();

        // Proses Hitung Rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Penentuan Hadiah
        String hadiah;
        if (rataRata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        } else if (rataRata >= 70) {
            hadiah = "Uang sebesar Rp. 500,000";
        } else {
            hadiah = "Hiburan";
        }

        // Layar Keluaran
        System.out.println("\nSiswa yang bernama " + namaSiswa);
        System.out.println("Memperoleh nilai rata-rata " + rataRata + " dari hasil perlombaan yang diikutinya");
        System.out.println("dan berhak mendapatkan hadiah " + hadiah);

        input.close();
    }
}