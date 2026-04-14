import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR\n");

        System.out.print("Nama Siswa : ");
        String nama = scanner.nextLine();

        System.out.print("Nilai Keaktifan : ");
        double nilaiKeaktifan = scanner.nextDouble();

        System.out.print("Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Nilai Ujian : ");
        double nilaiUjian = scanner.nextDouble();

        double murniKeaktifan = nilaiKeaktifan * 0.20;
        double murniTugas = nilaiTugas * 0.30;
        double murniUjian = nilaiUjian * 0.50;
        double nilaiAkhir = murniKeaktifan + murniTugas + murniUjian;

        String grade;
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 59) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println();
        System.out.println("Siswa yang bernama " + nama + ";");
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan.");
        System.out.printf("Nilai Keaktifan * 20%% : %.2f\n", murniKeaktifan);
        System.out.printf("Nilai Tugas * 30%% : %.2f\n", murniTugas);
        System.out.printf("Nilai Ujian * 50%% : %.2f\n", murniUjian);
        System.out.println("Jadi Siswa yang bernama " + nama + " memperoleh nilai akhir sebesar " + String.format("%.2f", nilaiAkhir));
        System.out.println();
        System.out.println("Grade nilai yang didapat adalah " + grade + ".");

        scanner.close();
    }
}
