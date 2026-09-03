package com.booking;

import java.util.Scanner;

public class TicketSystem {

    public static double calculateTotalCost(String category, int ticketCount) {
        double pricePerTicket = 0;

        switch (category.toLowerCase()) {
            case "regular":
                pricePerTicket = 50.0;
                break;
            case "premium":
                pricePerTicket = 100.0;
                break;
            case "vip":
                pricePerTicket = 200.0;
                break;
            default:
                System.out.println("Invalid category. Defaulting to Regular.");
                pricePerTicket = 50.0;
        }

        double rawCost = pricePerTicket * ticketCount;

        // Apply a 10% discount if purchasing more than 4 tickets
        if (ticketCount > 4) {
            rawCost = rawCost * 0.90;
        }

        return rawCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueBooking;

        do {
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Ticket Category (Regular, Premium, VIP): ");
            String category = scanner.nextLine();

            System.out.print("Enter Number of Tickets: ");
            int ticketCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            double finalCost = calculateTotalCost(category, ticketCount);

            System.out.println("\n--- Booking Details ---");
            System.out.println("Customer Name: " + name);
            System.out.println("Category: " + category);
            System.out.println("Tickets Booked: " + ticketCount);
            System.out.println("Total Amount Due: $" + finalCost);
            System.out.println("------------------------\n");

            System.out.print("Do you want to process another booking? (yes/no): ");
            continueBooking = scanner.nextLine();

        } while (continueBooking.equalsIgnoreCase("yes"));

        System.out.println("Ticket Booking System closed.");
        scanner.close();
    }
}
