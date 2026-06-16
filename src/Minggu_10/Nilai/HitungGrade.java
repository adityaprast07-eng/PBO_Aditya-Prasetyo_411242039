package Minggu_10.Nilai;

public class HitungGrade extends NilaiLengkap {
    
    public double getMurniUTS() {
        return getNilaiUTS() * 0.4;
    }

    public double getMurniUAS() {
        return getNilaiUAS() * 0.6;
    }

    public double getNilaiAkhir() {
        return getMurniUTS() + getMurniUAS();
    }

    public String getGrade() {
        double nilaiAkhir = getNilaiAkhir();
        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 75) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
