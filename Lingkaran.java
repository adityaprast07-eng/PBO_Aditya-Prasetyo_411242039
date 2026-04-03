import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        System.out.println("=== Lingkaran ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nilai Radius\t: ");
        double radius = scanner.nextDouble();

        double luas = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;

        System.out.println("Hasil Perhitungan");
        System.out.printf("Luas Lingkaran\t\t: %.2f%n", luas);
        System.out.printf("Keliling Lingkaran\t: %.2f%n", keliling);

        scanner.close();
    }
}
