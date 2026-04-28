package Minggu_4;

import java.util.Scanner;

public class AgenSusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkSusu, ukuranKaleng;
        int jumlahBeli;
        double hargaSatuan = 0, totalBayar;

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");
        System.out.println("Susu Dancow \n  Ukuran Kecil, Sedang, Besar");
        System.out.println("Susu Bendera \n  Ukuran Kecil, Sedang, Besar");
        System.out.println("Susu SGM \n  Ukuran Kecil, Sedang, Besar");
        System.out.println("--------------------------");

        // Input data
        System.out.print("Masukan Merk Susu [Dancow | Bendera | SGM] : ");
        merkSusu = input.nextLine();
        System.out.print("Masukan Ukuran Kaleng [Kecil|Sedang|Besar] : ");
        ukuranKaleng = input.nextLine();

        // Logika Penentuan Harga (Case-Insensitive menggunakan equalsIgnoreCase)
        if (merkSusu.equalsIgnoreCase("Dancow")) {
            if (ukuranKaleng.equalsIgnoreCase("Kecil")) {
                hargaSatuan = 25000;
            } else if (ukuranKaleng.equalsIgnoreCase("Sedang")) {
                hargaSatuan = 20000;
            } else if (ukuranKaleng.equalsIgnoreCase("Besar")) {
                hargaSatuan = 15000;
            }
        } else if (merkSusu.equalsIgnoreCase("Bendera")) {
            if (ukuranKaleng.equalsIgnoreCase("Kecil")) {
                hargaSatuan = 20000;
            } else if (ukuranKaleng.equalsIgnoreCase("Sedang")) {
                hargaSatuan = 17500;
            } else if (ukuranKaleng.equalsIgnoreCase("Besar")) {
                hargaSatuan = 13500;
            }
        } else if (merkSusu.equalsIgnoreCase("SGM")) {
            if (ukuranKaleng.equalsIgnoreCase("Kecil")) {
                hargaSatuan = 22000;
            } else if (ukuranKaleng.equalsIgnoreCase("Sedang")) {
                hargaSatuan = 18500;
            } else if (ukuranKaleng.equalsIgnoreCase("Besar")) {
                hargaSatuan = 15000;
            }
        }

        System.out.println("Harga Satuan Barang Rp. " + hargaSatuan);
        System.out.println("");

        System.out.print("Jumlah Yang dibeli : ");
        jumlahBeli = input.nextInt();

        // Hitung Total
        totalBayar = hargaSatuan * jumlahBeli;

        System.out.println("Harga Yang Harus dibayar Sebesar Rp. " + totalBayar);

        input.close();
    }
}