package Minggu_9;

public class Harimau {
    public static void main(String[] args) {
        Binatang binatang = new Binatang();
        JenisBinatang jns = new JenisBinatang("Harimau");
        
        jns.cetakjenis();
        binatang.cetakjenis();
    }
}