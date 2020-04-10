package com.itacademy.lesson4;

import java.util.Scanner;

public class HomeWork43 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of days:");
        int daysNo = scanner.nextInt();

        int value = 1;
        int sum = 0;
        int maxValue = 0;
        while (value <= daysNo) {

            System.out.println("Input precipitation amount in mm for day No " + value + ":");

            Scanner scanner1 = new Scanner(System.in);
            int precipitation = scanner1.nextInt();
            sum = sum + precipitation;

            if (maxValue < precipitation) {
                maxValue = precipitation;
            }

            value++;

        }

        System.out.println("Total precipitation amount in mm for the period of the last " + (value - 1) + " days: " + sum);

        double sum1 = sum;
        double daysNo1 = daysNo;
        double average = (sum1 / daysNo1);
        System.out.println("Average daily precipitation amount in mm for the period of the last " + (value - 1) + " days: " + average);

        System.out.println("Maximum daily precipitation amount in mm for the period of the last " + (value - 1) + " days: " + maxValue);

    }

}
