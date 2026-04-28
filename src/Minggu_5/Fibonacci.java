package Minggu_5;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Jumlah bilangan yang ingin ditampilkan
        int angka1 = 1, angka2 = 1;

        System.out.print("Deret Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(angka1);
            
            // Logika koma untuk tampilan
            if (i < n) {
                System.out.print(", ");
            }

            // Logika perhitungan Fibonacci
            int angkaBerikutnya = angka1 + angka2;
            angka1 = angka2;
            angka2 = angkaBerikutnya;
        }
        System.out.println(); // Baris baru
    }
}