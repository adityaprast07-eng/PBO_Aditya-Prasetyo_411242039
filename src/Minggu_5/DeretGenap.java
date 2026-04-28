package Minggu_5;

public class DeretGenap {
    public static void main(String[] args) {
        int jumlah = 0;
        int n = 10; // Jumlah bilangan dalam deret

        System.out.print("Hasil deret: ");

        for (int i = 1; i <= n; i++) {
            int bilanganGenap = i * 2;
            jumlah += bilanganGenap;

            // Logika untuk mencetak tanda '+' atau '='
            if (i < n) {
                System.out.print(bilanganGenap + " + ");
            } else {
                System.out.print(bilanganGenap + " = ");
            }
        }

        System.out.println(jumlah);
    }
}