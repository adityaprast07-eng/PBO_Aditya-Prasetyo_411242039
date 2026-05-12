package UTS;
import java.util.Scanner;

public class BeratBadanIdeal {

    // Method menghitung berat badan ideal
    static double hitungBeratIdeal(char jenisKelamin, double tinggiBadan) {
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            return tinggiBadan - 100;
        } else {
            return tinggiBadan - 110;
        }
    }

    // Method menentukan kategori
    static String tentukanKategori(double beratSebenarnya, double beratIdeal) {
        if (beratSebenarnya <= beratIdeal) {
            return "Kurus";
        } else {
            return "Gemuk";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("========================================");
            System.out.println("   PROGRAM HITUNG BERAT BADAN IDEAL    ");
            System.out.println("========================================");

            // Input jenis kelamin
            System.out.print("Pilih jenis kelamin (L/P) : ");
            char jenisKelamin = sc.next().charAt(0);

            // Validasi jenis kelamin
            while (jenisKelamin != 'L' && jenisKelamin != 'l' &&
                   jenisKelamin != 'P' && jenisKelamin != 'p') {
                System.out.print("Input tidak valid! Pilih jenis kelamin (L/P) : ");
                jenisKelamin = sc.next().charAt(0);
            }

            // Input tinggi badan
            System.out.print("Masukkan tinggi badan Anda (dalam cm)   : ");
            double tinggiBadan = sc.nextDouble();

            // Hitung berat ideal
            double beratIdeal = hitungBeratIdeal(jenisKelamin, tinggiBadan);
            System.out.printf("Berat badan ideal yang seharusnya       : %.0f Kg%n", beratIdeal);

            // Input berat badan sebenarnya
            System.out.print("Masukkan berat badan Anda (dalam Kg)    : ");
            double beratSebenarnya = sc.nextDouble();

            // Hitung selisih dan kategori
            double selisih = Math.abs(beratSebenarnya - beratIdeal);
            String kategori = tentukanKategori(beratSebenarnya, beratIdeal);

            System.out.println("----------------------------------------");
            if (kategori.equals("Kurus")) {
                System.out.printf("Anda termasuk kedalam kategori Kurus " +
                        "dan harus menambah berat badan sebanyak %.0f Kg " +
                        "(%.0f Kg - %.0f Kg)%n",
                        selisih, beratIdeal, beratSebenarnya);
            } else {
                System.out.printf("Anda termasuk kedalam kategori Gemuk " +
                        "dan harus mengurangi berat badan sebanyak %.0f Kg " +
                        "(%.0f Kg - %.0f Kg)%n",
                        selisih, beratSebenarnya, beratIdeal);
            }
            System.out.println("========================================");

            // Tanya ulang
            System.out.print("Apakah ingin mengulang program? (ya/tidak) : ");
            ulang = sc.next();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah menggunakan program ini.");
        sc.close();
    }
}