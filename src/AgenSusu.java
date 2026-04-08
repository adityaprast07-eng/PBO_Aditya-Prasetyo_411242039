import java.util.Scanner;

public class AgenSusu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");
        System.out.println("A. Susu Dancow");
        System.out.println("1. Ukuran Kecil");
        System.out.println("2. Ukuran Sedang");
        System.out.println("3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("1. Ukuran Kecil");
        System.out.println("2. Ukuran Sedang");
        System.out.println("3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("1. Ukuran Kecil");
        System.out.println("2. Ukuran Sedang");
        System.out.println("3. Ukuran Besar");
        System.out.println();

        System.out.print("Masukan Merk Susu [Dancow | Bendera | SGM] : ");
        String merk = scanner.nextLine().trim();

        System.out.print("Masukan Ukuran Kaleng [Kecil|Sedang|Besar] : ");
        String ukuran = scanner.nextLine().trim();

        int harga = 0;
        if (merk.equalsIgnoreCase("Dancow")) {
            if (ukuran.equalsIgnoreCase("Kecil")) {
                harga = 25000;
            } else if (ukuran.equalsIgnoreCase("Sedang")) {
                harga = 20000;
            } else if (ukuran.equalsIgnoreCase("Besar")) {
                harga = 15000;
            }
        } else if (merk.equalsIgnoreCase("Bendera")) {
            if (ukuran.equalsIgnoreCase("Kecil")) {
                harga = 20000;
            } else if (ukuran.equalsIgnoreCase("Sedang")) {
                harga = 17500;
            } else if (ukuran.equalsIgnoreCase("Besar")) {
                harga = 13500;
            }
        } else if (merk.equalsIgnoreCase("SGM")) {
            if (ukuran.equalsIgnoreCase("Kecil")) {
                harga = 22000;
            } else if (ukuran.equalsIgnoreCase("Sedang")) {
                harga = 18500;
            } else if (ukuran.equalsIgnoreCase("Besar")) {
                harga = 15000;
            }
        }

        if (harga == 0) {
            System.out.println();
            System.out.println("Input salah. Pastikan merk dan ukuran benar.");
        } else {
            System.out.println("Harga Satuan Barang Rp. " + harga);
            System.out.print("Jumlah Yang dibeli : ");
            int jumlah = scanner.nextInt();

            int totalBayar = harga * jumlah;
            System.out.println();
            System.out.println("Harga Yang Harus dibayar Sebesar Rp. " + totalBayar);
        }

        scanner.close();
    }
}
