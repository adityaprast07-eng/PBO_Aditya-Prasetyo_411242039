package Minggu_5;

public class BilanganPrima {
    public static void main(String[] args) {
        int jumlahTarget = 8; // Kita ingin menampilkan 8 bilangan prima pertama
        int hitung = 0;
        int angka = 2; // Mulai pengecekan dari angka 2

        System.out.print("Bilangan Prima: ");

        while (hitung < jumlahTarget) {
            boolean isPrima = true;

            // Cek apakah 'angka' bisa dibagi oleh bilangan lain selain 1 dan dirinya sendiri
            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    isPrima = false;
                    break;
                }
            }

            if (isPrima) {
                System.out.print(angka);
                hitung++;
                
                // Tambahkan koma jika bukan angka terakhir
                if (hitung < jumlahTarget) {
                    System.out.print(", ");
                }
            }
            angka++;
        }
        System.out.println();
    }
}