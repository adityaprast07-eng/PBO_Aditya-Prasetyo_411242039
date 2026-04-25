public class soal4 {
    public static void main(String[] args) {
        // Menampilkan bilangan prima
        System.out.print("Bilangan Prima: ");
        
        int count = 0;
        int num = 2;
        
        // Loop sampai mendapatkan 8 bilangan prima
        while (count < 8) {
            if (isPrime(num)) {
                System.out.print(num);
                count++;
                
                // Tambahkan koma jika bukan bilangan terakhir
                if (count < 8) {
                    System.out.print(", ");
                }
            }
            num++;
        }
        
        System.out.println();
    }
    
    // Method untuk mengecek apakah suatu bilangan adalah prima
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
