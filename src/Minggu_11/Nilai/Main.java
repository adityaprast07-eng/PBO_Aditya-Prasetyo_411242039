package Minggu_11.Nilai;
import java.util.Scanner;
// Mengimport kelas HitungNilai sesuai dengan package bertingkat yang kamu buat
import Minggu_11.Nilai.HitungNilai; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat objek dari kelas yang ada di package Minggu_11.Nilai
        HitungNilai mahasiswa = new HitungNilai();

        System.out.println("====== PROGRAM HITUNG NILAI AKHIR MAHASISWA ======");
        
        // Input data dari keyboard
        System.out.print("Masukkan Nilai Tugas Mandiri : ");
        double tugas = input.nextDouble();
        mahasiswa.setNilaiTugas(tugas); 

        System.out.print("Masukkan Nilai Quis          : ");
        double quis = input.nextDouble();
        mahasiswa.setNilaiQuis(quis); 

        System.out.print("Masukkan Nilai Ujian         : ");
        double ujian = input.nextDouble();
        mahasiswa.setNilaiUjian(ujian); 
        
        // Menampilkan Output Hasil
        System.out.println("\n==================================================");
        System.out.println("               RINCIAN NILAI MURNI                ");
        System.out.println("==================================================");
        System.out.printf("Nilai Murni Tugas (25%%) : %.2f\n", mahasiswa.getMurniTugas());
        System.out.printf("Nilai Murni Quis (30%%)  : %.2f\n", mahasiswa.getMurniQuis());
        System.out.printf("Nilai Murni Ujian (45%%) : %.2f\n", mahasiswa.getMurniUjian());
        System.out.println("--------------------------------------------------");
        System.out.printf("TOTAL NILAI AKHIR       : %.2f\n", mahasiswa.getNilaiAkhir());
        System.out.println("==================================================");
        
        input.close();
    }
}