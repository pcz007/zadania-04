package com.example.zadanie4_2;

import java.util.Locale;
import java.util.Scanner;

public class LineTest {
//zadanie nieukońcozne
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Podaj początek odcinka 1: ");
        int odcinek1punktA = input.nextInt();
        System.out.println("Podaj koniec odcinka 1: ");
        int odcinek1punktB = input.nextInt();
        System.out.println("Podane punkty: " + odcinek1punktA +" "+ odcinek1punktB);

       Point odcinek1 = new Point(odcinek1punktA,odcinek1punktB);

        System.out.println("Podaj początek odcinka 2: ");
        int odcinek2punktA = input.nextInt();
        System.out.println("Podaj koniec odcinka 2: ");
        int odcinek2punktB = input.nextInt();
        System.out.println("Podane punkty: " + odcinek2punktA +" "+ odcinek2punktB);

        Point odcinek2 = new Point(odcinek2punktA, odcinek2punktB);

        System.out.println("Odcinek pierwszy: " + odcinek1.getX() + " " + odcinek1.getY());
        System.out.println("Odcinek drugi: " + odcinek2.getX() + " " + odcinek2.getY());

    }
}
