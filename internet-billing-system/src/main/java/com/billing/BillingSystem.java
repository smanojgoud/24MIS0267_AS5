package com.billing;

import java.util.Scanner;

public class BillingSystem {

    public static double calculateBill(String planType, double dataUsed) {
        double basePrice = 0;
        double dataLimit = 0;
        double extraChargePerGB = 0;

        switch (planType.toLowerCase()) {
            case "basic":
                basePrice = 20.0;
                dataLimit = 10.0;
                extraChargePerGB = 2.0;
                break;
            case "standard":
                basePrice = 40.0;
                dataLimit = 50.0;
                extraChargePerGB = 1.5;
                break;
            case "premium":
                basePrice = 60.0;
                dataLimit = 100.0;
                extraChargePerGB = 1.0;
                break;
            default:
                System.out.println("Invalid plan type. Defaulting to Basic.");
                basePrice = 20.0;
                dataLimit = 10.0;
                extraChargePerGB = 2.0;
        }

        if (dataUsed <= dataLimit) {
            return basePrice;
        } else {
            double extraData = dataUsed - dataLimit;
            return basePrice + (extraData * extraChargePerGB);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueProcessing;

        do {
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Plan Type (Basic, Standard, Premium): ");
            String planType = scanner.nextLine();

            System.out.print("Enter Data Consumed (in GB): ");
            double dataUsed = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            double finalBill = calculateBill(planType, dataUsed);

            System.out.println("\n--- Invoice ---");
            System.out.println("Customer Name: " + name);
            System.out.println("Plan Type: " + planType);
            System.out.println("Data Used: " + dataUsed + " GB");
            System.out.println("Total Monthly Bill: $" + finalBill);
            System.out.println("----------------\n");

            System.out.print("Do you want to process another customer? (yes/no): ");
            continueProcessing = scanner.nextLine();

        } while (continueProcessing.equalsIgnoreCase("yes"));

        System.out.println("Billing system closed.");
        scanner.close();
    }
}
