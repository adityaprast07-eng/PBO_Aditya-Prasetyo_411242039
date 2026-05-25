package Minggu_9;

class PerhitunganDua extends Aritmatika {
    protected int z;
    
    public PerhitunganDua(int z, int x, int y) {
        super(x, y); // constructor Aritmatika
        this.z = z;
    }
    
    public int Hitung() {
        return z + super.kali();
    }
    
    public void hasil() {
        System.out.println("Nilai Z = " + this.z);
        super.hasil();
    }
}

public class Lat805 {
    public static void main(String[] args) {
        PerhitunganDua matematika = new PerhitunganDua(5, 4, 3);
        matematika.hasil();
        System.out.println("Hasil Perhitungannya = " + matematika.Hitung());
    }
}