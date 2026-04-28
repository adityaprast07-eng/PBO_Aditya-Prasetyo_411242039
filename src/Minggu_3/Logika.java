package Minggu_3;

public class Logika{
    public static void main(String[] args) {
        int A = 3, B = 6, C = 2, K = 5, L = 4, M = 3;

        boolean res1 = (4 + 2 > A && B - 2 > 3 + 2 || B + 2 <= 6 + 2);
        boolean res2 = K + 5 < M || (C * M < L && 2 * M - L > 0);
        boolean res3 = L + 5 < M || C * K < L && 2 * K - L > 0;
        boolean res4 = A * 4 <= 3 * M + B;
        boolean res5 = K + 10 > A && L - 2 > 4 * C;

        System.out.println("Hasil 1: " + res1);
        System.out.println("Hasil 2: " + res2);
        System.out.println("Hasil 3: " + res3);
        System.out.println("Hasil 4: " + res4);
        System.out.println("Hasil 5: " + res5);
    }
}