import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Nilai Siswa ===");
        System.out.print("Masukan Nama Siswa\t: ");
        String nama = scanner.nextLine();

        System.out.print("Nilai UTS\t\t: ");
        double uts = scanner.nextDouble();

        System.out.print("Nilai UAS\t\t: ");
        double uas = scanner.nextDouble();

        System.out.print("Nilai Tugas Mandiri\t: ");
        double tugasMandiri = scanner.nextDouble();

        double nilaiMurniUTS = uts * 0.35;
        double nilaiMurniUAS = uas * 0.45;
        double nilaiMurniTugas = tugasMandiri * 0.20;

        double nilaiAkhir = nilaiMurniUTS + nilaiMurniUAS + nilaiMurniTugas;

        System.out.println("\nHasil Perhitungan Nilai Akhir");
        System.out.println("Nama Siswa\t\t: " + nama);
        System.out.printf("Nilai Murni UTS\t\t: %.2f%n", nilaiMurniUTS);
        System.out.printf("Nilai Murni UAS\t\t: %.2f%n", nilaiMurniUAS);
        System.out.printf("Nilai Murni Tugas\t: %.2f%n", nilaiMurniTugas);
        System.out.printf("Nilai Akhir\t\t: %.2f%n", nilaiAkhir);

        scanner.close();
    }
}
