package org.nutech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int rows5 = 5;
        for (int i = rows5; i >= 1; i--) {
            // Menambahkan spasi di sebelah kiri
            for (int j = 1; j <= (rows5 - i); j++) {
                System.out.print("  ");
            }
            // Menambahkan bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n");

        int rows7 = 5;
        for (int i = 1; i <= rows7; i++) {
            // Menambahkan spasi di sebelah kiri
            for (int j = i; j < rows7; j++) {
                System.out.print("  ");
            }
            // Menambahkan bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int rows1 = 5;
        for (int i = rows1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int rows2 = 5;
        for (int i = 1; i <= rows2; i++) {
            for (int j = i; j < rows2; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int rows3 = 5;
        for (int i = rows3; i >= 1; i--) {
            for (int j = i; j < rows3; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int rows4 = 5;
        for (int i = 1; i <= rows4; i++) {
            for (int j = i; j < rows4; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = rows4 - 1; i >= 1; i--) {
            for (int j = i; j < rows4; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}