package UTS;

import java.util.Scanner;

public class NilaiAkhirMahasiswa {

    // Class Mahasiswa (OOP - Encapsulation)
    static class Mahasiswa {
        String nama;
        double nilaiTugas;
        double nilaiUTS;
        double nilaiUAS;

        Mahasiswa(String nama, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
            this.nama       = nama;
            this.nilaiTugas = nilaiTugas;
            this.nilaiUTS   = nilaiUTS;
            this.nilaiUAS   = nilaiUAS;
        }

        double nilaiMurniTugas() { return nilaiTugas * 0.30; }
        double nilaiMurniUTS()   { return nilaiUTS   * 0.30; }
        double nilaiMurniUAS()   { return nilaiUAS   * 0.40; }

        double nilaiAkhir() {
            return nilaiMurniTugas() + nilaiMurniUTS() + nilaiMurniUAS();
        }

        String grade() {
            double a = nilaiAkhir();
            if      (a >= 80) return "A";
            else if (a >= 70) return "B";
            else if (a >= 59) return "C";
            else if (a >= 50) return "D";
            else              return "E";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
            // ── LAYAR MASUKAN ──────────────────────────────────────────
            System.out.println("============================================================");
            System.out.println("  PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA");
            System.out.println("============================================================");

            System.out.print("Masukkan Jumlah Mahasiswa: ");
            int jumlah = sc.nextInt();
            sc.nextLine();

            Mahasiswa[] list = new Mahasiswa[jumlah];

            for (int i = 0; i < jumlah; i++) {
                System.out.println();
                System.out.println("Mahasiswa Ke - " + (i + 1));
                System.out.print("Nama Mahasiswa : ");
                String nama = sc.nextLine();

                System.out.print("Nilai Tugas    : ");
                double tugas = sc.nextDouble();

                System.out.print("Nilai UTS      : ");
                double uts = sc.nextDouble();

                System.out.print("Nilai UAS      : ");
                double uas = sc.nextDouble();
                sc.nextLine();

                list[i] = new Mahasiswa(nama, tugas, uts, uas);
            }

            // ── LAYAR KELUARAN ─────────────────────────────────────────
            System.out.println();
            System.out.println("DAFTAR NILAI");
            System.out.println("MATERI : PEMROGRAMAN PBO");
            System.out.println("-------------------------------------------------------------");
            System.out.printf("%-4s %-15s %-30s %s%n",
                    "No.", "Nama", "              Nilai", "Grade");
            System.out.printf("%-4s %-15s %-7s %-6s %-6s %-7s%n",
                    "", "Mahasiswa", "Tugas", "UTS", "UAS", "Akhir");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < jumlah; i++) {
                Mahasiswa m = list[i];
                System.out.printf("%-4d %-15s %-7.0f %-6.0f %-6.0f %-7.2f %s%n",
                        (i + 1),
                        m.nama,
                        m.nilaiTugas,
                        m.nilaiUTS,
                        m.nilaiUAS,
                        m.nilaiAkhir(),
                        m.grade());
            }

            System.out.println("-------------------------------------------------------------");

            // ── LOOP ───────────────────────────────────────────────────
            System.out.print("\nApakah ingin mengulang program? (ya/tidak) : ");
            ulang = sc.next();
            sc.nextLine();
            System.out.println();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah menggunakan program ini.");
        sc.close();
    }
}