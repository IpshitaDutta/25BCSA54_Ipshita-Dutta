package com.secondprog;
import java.util.Scanner;
public class loginsystem {
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "Java@123";
        int wrongAttempts = 0;
        boolean isLoggedIn = false;

        System.out.println("=== Login System ===");

        // Username validation
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Check if username is correct
        if (!username.equals(correctUsername)) {
            System.out.println("Invalid username!");
            sc.close();
            return;
        }

        // Password validation with twist conditions
        while (wrongAttempts < 3) {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            // Check if password is correct
            if (password.equals(correctPassword)) {
                isLoggedIn = true;
                break;
            }
            // Extra twist: Check if password starts with "Java" and ends with "123"
            else if (password.startsWith("Java") && password.endsWith("123")) {
                System.out.println("Almost correct password");
                wrongAttempts++;
            } else {
                wrongAttempts++;
            }

            // Check if account is blocked
            if (wrongAttempts >= 3) {
                System.out.println("Account Blocked");
                sc.close();
                return;
            }

            System.out.println("Invalid password! Attempt " + wrongAttempts + " of 3");
        }

        // If logged in, ask for OTP
        if (isLoggedIn) {
            System.out.print("Enter OTP (4-digit number): ");
            int otp = sc.nextInt();

            // Validate OTP (between 1000 and 9999)
            if (otp >= 1000 && otp <= 9999) {
                System.out.println();
                System.out.println("=== Login Successful ===");
                System.out.println("Welcome, " + username + "!");
                System.out.println("You have been authenticated.");
            } else {
                System.out.println("Invalid OTP! OTP must be a 4-digit number.");
            }
        }

        sc.close();
}
}
