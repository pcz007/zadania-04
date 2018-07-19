package com.example.zadanie4_2;

import java.util.Locale;
import java.util.Scanner;

public class LineTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Podaj początek odcinka 1 (cm): ");
        int odcinek1punktA = input.nextInt();
        System.out.println("Podaj koniec odcinka 1 (cm):");
        int odcinek1punktB = input.nextInt();

        Point odcinek1 = new Point(odcinek1punktA, odcinek1punktB);

        System.out.println("Podaj początek odcinka 2 (cm): ");
        int odcinek2punktA = input.nextInt();
        System.out.println("Podaj koniec odcinka 2 (cm):");
        int odcinek2punktB = input.nextInt();

        Point odcinek2 = new Point(odcinek2punktA, odcinek2punktB);

        System.out.println("Początek odcinka 1: " + odcinek1.getX() + ", Koniec odcinka 1: " + odcinek1.getY());
        int dlugosc1 = odcinek1.getY() - odcinek1.getX();
        System.out.println("Całkowita długość odcinka 1 = " + dlugosc1 + " cm");
        System.out.println("Początek odcinka 2: " + odcinek2.getX() + ", Koniec odcinka 2: " + odcinek2.getY());
        int dlugosc2 = odcinek2.getY() - odcinek2.getX();
        System.out.println("Całkowita długość odcinka 2 = " + dlugosc2 + " cm");

        if (dlugosc1 > dlugosc2) {
            System.out.println("Odcinek 1 jest dłuższy od odcinka 2");
        } else if (dlugosc1 < dlugosc2) {
            System.out.println("Odcinek 2 jest dłuższy od odcinka 1");
        } else {
            System.out.println("Odcinki są sobie równe");
        }

    }
}
