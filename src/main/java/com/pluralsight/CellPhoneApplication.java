package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the phone's info
        System.out.println("what is the serial number: " );
        int serialNumber = scanner.nextInt();

        scanner.nextLine(); ///eat the new line

        System.out.println("what model is the phone: ");
        String model = scanner.nextLine().trim();

        System.out.println("who is the carrier: ");
        String carrier = scanner.nextLine().trim();

        System.out.println("what is the phone number: ");
        String phoneNumber = scanner.nextLine().trim();

        System.out.println("who is the owner of the phone?: ");
        String owner = scanner.nextLine().trim();

        // Create CellPhone object using the user's input
        CellPhone cellphone;
        cellphone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        // Display the stored phone information using getters
        System.out.println("serial number is:" + " " + cellphone.getSerialNumber());
        System.out.println("phone model is:" + " " + cellphone.getModel());
        System.out.println("carrier is:" + " " + cellphone.getCarrier());
        System.out.println("phone number is:" + " " + cellphone.getPhoneNumber());
        System.out.println("owner of the phone is:" + " " + cellphone.getOwner());

        cellphone.dial("855-555-2222");

    }
}
