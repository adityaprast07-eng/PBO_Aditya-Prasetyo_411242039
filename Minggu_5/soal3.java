public class soal3 {
    public static void main(String[] args) {
        // Menampilkan deret Fibonacci
        int n = 8; // Jumlah bilangan Fibonacci yang ditampilkan
        int num1 = 1, num2 = 1;
        
        System.out.print("Deret Fibonacci: ");
        
        // Tampilkan dua bilangan pertama
        System.out.print(num1 + ", " + num2);
        
        // Loop untuk menampilkan bilangan Fibonacci berikutnya
        for (int i = 2; i < n; i++) {
            int nextNum = num1 + num2;
            System.out.print(", " + nextNum);
            
            // Update nilai untuk iterasi berikutnya
            num1 = num2;
            num2 = nextNum;
        }
        
        System.out.println();
    }
}
