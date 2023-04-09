package com.bridgelabz.day5Basic;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of times to flip coin: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input. The number of times to flip coin should be a positive integer.");
                return;
            }

            Random rand = new Random();
            int heads = 0, tails = 0;
            for (int i = 0; i < n; i++) {
                if (rand.nextDouble() < 0.5) {
                    tails++;
                } else {
                    heads++;
                }
            }

            double percentHeads = (double) heads / n * 100;
            double percentTails = (double) tails / n * 100;

            System.out.println("Heads: " + percentHeads + "%");
            System.out.println("Tails: " + percentTails + "%");
        }
    }


