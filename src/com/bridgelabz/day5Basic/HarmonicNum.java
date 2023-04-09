package com.bridgelabz.day5Basic;

import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double harmonic = 0.0;

        System.out.print("Enter the value of N: ");
        n = input.nextInt();

        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                harmonic += 1.0 / i;
            }
            System.out.println("The " + n + "th harmonic value is: " + harmonic);
        } else {
            System.out.println("Invalid input: N should not be zero.");
        }
    }
}
