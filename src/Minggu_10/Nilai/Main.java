package Minggu_10.Nilai;

import java.util.Scanner; // Import Scanner untuk menerima input keyboard

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menangkap input
        Scanner input = new Scanner(System.in);
        
        // Membuat objek dari subclass
        HitungGrade mahasiswa = new HitungGrade();

        System.out.println("====== INPUT DATA NILAI MAHASISWA ======");
        
        // Meminta input Nilai UTS dari user
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        mahasiswa.setNilaiUTS(uts); // Memasukkan hasil input ke Encapsulation

        // Meminta input Nilai UAS dari user
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();
        mahasiswa.setNilaiUAS(uas); // Memasukkan hasil input ke Encapsulation
        
        System.out.println(); // Membuat baris baru agar rapi

        // Menampilkan hasil perhitungan
        System.out.println("====== HASIL HITUNG NILAI & GRADE ======");
        System.out.println("Nilai UTS Asli    : " + mahasiswa.getNilaiUTS());
        System.out.println("Nilai UAS Asli    : " + mahasiswa.getNilaiUAS());
        System.out.println("------------------------------------------");
        System.out.println("Nilai Murni UTS (40%) : " + mahasiswa.getMurniUTS());
        System.out.println("Nilai Murni UAS (60%) : " + mahasiswa.getMurniUAS());
        System.out.println("------------------------------------------");
        System.out.println("NILAI AKHIR       : " + mahasiswa.getNilaiAkhir());
        System.out.println("GRADE             : " + mahasiswa.getGrade());
        System.out.println("==========================================");
        
        // Menutup scanner (good practice)
        input.close();
    }
}