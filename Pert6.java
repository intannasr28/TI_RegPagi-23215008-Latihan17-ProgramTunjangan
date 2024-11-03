package pert6;

import java.util.Scanner;

public class Pert6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======= Program Tunjangan =======");

        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        double gajiPokok = input.nextDouble();

        System.out.print("Status anda? (menikah/belum) : ");
        String statusPernikahan = input.next();

        double tunjangan = 0;
        if (statusPernikahan.equalsIgnoreCase("menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\nHasil perhitungan Gaji Anda:");
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan        : Rp " + tunjangan);
        System.out.println("Total Gaji       : Rp " + totalGaji);
    }
}
