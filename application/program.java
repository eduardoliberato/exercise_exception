package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        sc.nextLine();
        System.out.print("Inicial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        System.out.print("Enter amount for withdraw: ");
        double withdraw = sc.nextDouble();
        System.out.print("New balance: ");

        sc.close();

    }
}