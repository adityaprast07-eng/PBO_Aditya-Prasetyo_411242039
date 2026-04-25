public class soal2 {
    public static void main(String[] args) {
        // Menghitung sum dari 10 deret bilangan ganjil
        int sum = 0;
        System.out.print("Deret bilangan ganjil: ");
        
        // Loop untuk 10 bilangan ganjil mulai dari 1
        for (int i = 0; i < 10; i++) {
            int oddNumber = i * 2 + 1;
            sum += oddNumber;
            System.out.print(oddNumber);
            
            // Tambahkan tanda + jika bukan bilangan terakhir
            if (i < 9) {
                System.out.print(" + ");
            }
        }
        
        System.out.println(" = " + sum);
    }
}
