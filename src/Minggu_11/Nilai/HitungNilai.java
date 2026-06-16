package Minggu_11.Nilai;

public class HitungNilai {
    // Enkapsulasi: Atribut disembunyikan menggunakan modifier private
    private double nilaiTugas;
    private double nilaiQuis;
    private double nilaiUjian;

    // Constructor kosong
    public HitungNilai() {
    }

    // --- Setter untuk mengisi nilai dari luar package ---
    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void setNilaiQuis(double nilaiQuis) {
        this.nilaiQuis = nilaiQuis;
    }

    public void setNilaiUjian(double nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }

    // --- Method untuk menghitung Nilai Murni (Persentase) ---
    
    // Nilai Murni Tugas Mandiri (25%)
    public double getMurniTugas() {
        return this.nilaiTugas * 0.25;
    }

    // Nilai Murni Quis (30%)
    public double getMurniQuis() {
        return this.nilaiQuis * 0.30;
    }

    // Nilai Murni Ujian (45%)
    public double getMurniUjian() {
        return this.nilaiUjian * 0.45;
    }

    // --- Method untuk menghitung Total Nilai Akhir ---
    public double getNilaiAkhir() {
        return getMurniTugas() + getMurniQuis() + getMurniUjian();
    }
}
