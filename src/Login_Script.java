// Homework: extension on of Username password login

import java.util.Scanner;

public class Login_Script {
    public static void main(String[] args) {
        String username;
        String password;
        // reads username and password input

        String actualUsername = "admin";
        String actualPassword = "PaSSword";

        Scanner reader = new Scanner(System.in);

        boolean accessGranted = false;

        while (!accessGranted) {

            do {
                System.out.print("Enter username: ");
                // converts username to lowercase to so its not case sensitive
                username = reader.nextLine().toLowerCase();
            } while (username.isEmpty());

            System.out.print("Enter Password: ");
            password = reader.nextLine();

            // condition: print access if username and password correct
            if (username.equals(actualUsername) && password.equals(actualPassword)) {
                System.out.println("Access Granted");
                accessGranted = true;
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}

