package kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public double tambah(double a, double b) {
        return a + b;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    public double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian oleh nol tidak valid.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.println("Hasil Penjumlahan: " + calc.tambah(angka1, angka2));
        System.out.println("Hasil Pengurangan: " + calc.kurang(angka1, angka2));
        System.out.println("Hasil Perkalian: " + calc.kali(angka1, angka2));
        System.out.println("Hasil Pembagian: " + calc.bagi(angka1, angka2));

        scanner.close();
    }
}
