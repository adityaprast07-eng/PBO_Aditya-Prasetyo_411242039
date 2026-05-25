package Minggu_9;

class Perhitungan {
    static public int hitung(int a, int b) {
        return a + b;
    }
    static public double hitung(double a, double b, double c) {
        return (a + b) / c;
    }
}

public class Lat803 {
    public static void main(String[] args) {

        int hitung = Perhitungan.hitung(4, 8); 
        double bagi = Perhitungan.hitung(55, 69, 2);
        
        System.out.println("Hasil Perhitungan = " + hitung);
        System.out.println("Hasil Pembagian = " + bagi);
    }
}