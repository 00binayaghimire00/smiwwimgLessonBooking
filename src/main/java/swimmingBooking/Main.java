package swimmingBooking;

import swimmingBooking.Controller.Learners;
import swimmingBooking.ExceptionHandling.InputHandling;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Online Swimming Booking System");
        System.out.println("Are you a Valid User? Y or N");
        Scanner read = new Scanner(System.in);
        String userSelectedOption = InputHandling.getInputByString().toLowerCase();
        if (!userSelectedOption.equals("y") && !userSelectedOption.equals("n")) {
            userSelectedOption = read.nextLine().toLowerCase();
        }
        if (userSelectedOption.equals("y")) {
            System.out.println("Input Username and Password");
            System.out.println("Username: ");
            String username = read.nextLine().toLowerCase();
            System.out.println("Password: ");
            String password = read.nextLine().toUpperCase();
            Learners.checkValidUser(username, password);
        } else {
            Learners.registerNewLearners();
        }
    }
}
