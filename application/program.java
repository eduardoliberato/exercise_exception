package application;

import java.util.Locale;
import java.util.Scanner;
import entities.account;
import exception.accountException;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

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

        account account = new account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
         System.out.println(account);
        
        }
        catch(accountException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}       
        
       

        sc.close();

    }
}