package Minggu_5;

public class DeretGanjil {
    public static void main(String[] args) {
        int jumlah = 0;
        int n = 10; // Jumlah bilangan dalam deret

        System.out.print("Hasil deret ganjil: ");

        for (int i = 1; i <= n; i++) {
            // Rumus bilangan ganjil: (2 * n) - 1
            int bilanganGanjil = (i * 2) - 1;
            jumlah += bilanganGanjil;

            // Logika tampilan tanda '+' atau '='
            if (i < n) {
                System.out.print(bilanganGanjil + " + ");
            } else {
                System.out.print(bilanganGanjil + " = ");
            }
        }

        System.out.println(jumlah);
    }
}