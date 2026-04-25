public class soal1 {
    public static void main(String[] args) {
        // Menghitung sum dari 10 deret bilangan genap
        int sum = 0;
        System.out.print("Deret bilangan genap: ");
        
        // Loop untuk 10 bilangan genap mulai dari 2
        for (int i = 1; i <= 10; i++) {
            int evenNumber = i * 2;
            sum += evenNumber;
            System.out.print(evenNumber);
            
            // Tambahkan tanda + jika bukan bilangan terakhir
            if (i < 10) {
                System.out.print(" + ");
            }
        }
        
        System.out.println(" = " + sum);
    }
}
