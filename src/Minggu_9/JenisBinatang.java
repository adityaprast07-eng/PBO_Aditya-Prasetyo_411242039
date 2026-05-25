package Minggu_9;

public class JenisBinatang extends Binatang {
    String jenis;
    
    JenisBinatang(String jenisBinatang) {
        super(jenisBinatang);
    }
    
    @Override
    public void cetakjenis() {
        super.cetakjenis();
        jenis = "Predator";
        System.out.println("Jenis Binatang : " + jenis);
    }
}