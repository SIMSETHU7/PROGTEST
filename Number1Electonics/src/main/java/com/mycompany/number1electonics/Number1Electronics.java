/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electonics;

/**
 *
 * @author Student
 */
public class Number1Electronics {

    public static void main(String[] args) {

        // Single-dimensional array for city names
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Single-dimensional array for console types
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Two-dimensional array for sales
        // Each row represents a city
        // Each column represents a console
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        // Display headings
        System.out.printf("%-20s %-12s %-12s %-12s%n",
                "", consoles[0], consoles[1], consoles[2]);

        // Display sales data
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %-12d %-12d %-12d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        int highestSales = 0;
        String cityWithMostSales = "";

        // Calculate total sales for each city
        for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            System.out.printf("%-20s %d%n", cities[i], total);

            // Find city with the most sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("------------------------------------------------------------");
    }
}
