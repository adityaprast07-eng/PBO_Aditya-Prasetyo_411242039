package Minggu_6;

public class NestedFor {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("1. Piramida");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("2. Piramida Terbalik");
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("3. Piramida Kanan");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("4. Piramida Kiri");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("5. Bentuk X");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}