package com.company;

import java.util.Scanner;

public class Learn1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite a : ");
        double a = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Vvedite b : ");
        double b = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Vvedite c : ");
        double c = scan2.nextDouble();

    double z = ((a - 3) * b / 2) + c;

    System.out.printf("rezult -> %.2f", z);
    scan.close();
    scan1.close();
    scan2.close();
    }
}
