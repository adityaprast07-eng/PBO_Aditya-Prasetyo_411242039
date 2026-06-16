package Minggu_11.BangunDatar;

public class Lingkaran {
    // Enkapsulasi: Atribut disembunyikan dengan modifier private
    private double radius;

    // Constructor kosong
    public Lingkaran() {
    }

    // Setter untuk mengisi nilai radius dari luar kelas/package
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter untuk mengambil kembali nilai radius jika dibutuhkan
    public double getRadius() {
        return this.radius;
    }

    // Method untuk menghitung Luas Lingkaran (π × r × r)
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung Keliling Lingkaran (2 × π × r)
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}