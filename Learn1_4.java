package com.company;
import java.util.Scanner;

public class Learn1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo nnn.ddd : ");

        String str1 = scan.nextLine();
        try {
            if (Double.parseDouble(str1) >= 0 ){
            String[] str = str1.split("\\.");
            System.out.println(Integer.parseInt(str[1]) + "." + Integer.parseInt(str[0]));
        }
            else {
            Double a = Math.abs(Double.parseDouble(str1));
            String str = String.valueOf(a);
            String[] str2 = str.split("\\.");
            System.out.println("-" + Integer.parseInt(str2[1]) + "." + Integer.parseInt(str2[0]));
            }
        }
        catch (NumberFormatException e) {
            System.err.println("Neverni format chisla !");
        }
        scan.close();
    }
}
