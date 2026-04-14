import java.util.Scanner;

public class nilairata_rata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI RATA-RATA\n");

        System.out.println("Nama Siswa");
        System.out.print(": ");
        String nama = scanner.nextLine();
        System.out.println();

        System.out.println("Nilai Pertandingan I");
        System.out.print(": ");
        double nilai1 = scanner.nextDouble();
        System.out.println();

        System.out.println("Nilai Pertandingan II");
        System.out.print(": ");
        double nilai2 = scanner.nextDouble();
        System.out.println();

        System.out.println("Nilai Pertandingan III");
        System.out.print(": ");
        double nilai3 = scanner.nextDouble();
        System.out.println();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;

        System.out.println("Hasil:");
        System.out.println("Nama Siswa : " + nama);
        System.out.printf("Nilai Rata-Rata : %.2f\n", rataRata);

        if (rataRata >= 85) {
            System.out.println("Hadiah : Seperangkat Komputer P4");
        } else if (rataRata >= 70) {
            System.out.println("Hadiah : Seperangkat Uang sebesar Rp. 500,000");
        } else {
            System.out.println("Hadiah : Hiburan");
        }

        scanner.close();
    }
}
