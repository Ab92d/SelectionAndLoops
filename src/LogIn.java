// Homework: extension on of Username password login

import java.awt.*;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String username;
        String password;
        // reads username and password input
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Enter username: ");
            // converts username to lowercase to so its not case sensitive
            String s = reader.nextLine();
            username = s.toLowerCase();
            System.out.println("Enter Password: ");
            password = reader.nextLine();
        } while (username.isEmpty());

        // condition: print access if username and password correct
        if (username.equals("admin") && password.equals("PaSSword")) {
            System.out.println("Assess Granted");
        } else {
            do {
            System.out.println("Access Denied");

            System.out.println("Enter username: ");
            username = reader.nextLine();
            System.out.println("Enter Password: ");
            password = reader.nextLine();
            } while (password != "PaSSword"); // loop: ask for username password infinie times if
        }                                     // password incorrect
    }
}











//        String username;
//        String password;
//        Scanner reader = new Scanner(System.in);
//        do {
//            System.out.println("Enter username: ");
//            username = reader.nextLine();
//            System.out.println("Enter Password: ");
//            password = reader.nextLine();
//        } while (username.isEmpty());
//
//        if (username.equals("Admin") && password.equals("PaSSword")) {
//            System.out.println("Assess Granted");
//        } else {
//            System.out.println("Access Denied");
//        }
//
//
//    }
//
//}




