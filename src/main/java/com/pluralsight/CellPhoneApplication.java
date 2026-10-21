package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the phone's info
        System.out.println("what is the serial number: ");
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

        CellPhone cellphone2;
        cellphone2 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);


        display(cellphone);
        display(cellphone2);

        // call 855-555-2222
        cellphone.dial("855-555-2222");

        cellphone.dial(cellphone2.getPhoneNumber());
        cellphone2.dial(cellphone.getPhoneNumber());

    }

    private static void display(CellPhone phone) {
        System.out.println("-----------------------");
        System.out.println("serial number is:" + " " + phone.getSerialNumber());
        System.out.println("phone model is:" + " " + phone.getModel());
        System.out.println("carrier is:" + " " + phone.getCarrier());
        System.out.println("phone number is:" + " " + phone.getPhoneNumber());
        System.out.println("owner of the phone is:" + " " + phone.getOwner());
        System.out.println("-----------------------");

    }
}
