package com.company;

import java.util.Scanner;

public class Main {
    public static int month;
    public static void daysInMonth() {
        System.out.println("Enter the corresponding number of the month you would like to know about");
        //enter a number between 1 and 12
        Scanner inputVar = new Scanner(System.in);
        month = inputVar.nextInt();

        if (month <= 12 && month > 0) {
            if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                System.out.println("This month has 30 days");
            } else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                System.out.println("This month has 31 days");
            } else {
                System.out.println("This month has 28 days");
            }
        }
        else {
            System.out.println("You must enter a number between 1 and 12.");
        }
    }

    public static void main(String[] args) {
        daysInMonth();

    }
}