package Minggu_9;

class Lat802 {
    float nilakhir;

    Lat802(int nilai_akhir) {
        nilakhir = nilai_akhir;
    }

    public String grade() {
        String nilgrade;
        if (nilakhir >= 80) nilgrade = "A";
        else if (nilakhir >= 68) nilgrade = "B";
        else if (nilakhir >= 56) nilgrade = "C";
        else if (nilakhir >= 49) nilgrade = "D";
        else nilgrade = "E";
        return nilgrade;
    }

    public void cetak() {
        System.out.println("Grade Nilainya = " + grade());
    }

    public static void main(String[] args) {
        Lat802 hasil = new Lat802(67);
        hasil.cetak();
    }
}
