package com.bridgelabz.day5Basic;

import java.util.Scanner;

public class LeapYearNew {
    public class leapyear{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a 4-digit year: ");
            int year = sc.nextInt();

            if (year < 1000 || year > 9999) {
                System.out.println("Invalid year. Please enter a 4-digit number.");
            } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

}
