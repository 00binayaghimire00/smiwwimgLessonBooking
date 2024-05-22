package swimmingBooking.ExceptionHandling;

import swimmingBooking.Controller.StartSwimmingLessons;

import java.util.Scanner;

public class InputHandling {
    static Scanner read = new Scanner(System.in);
    public static String getInputByString() {
        String input = read.next();
        if (input.equals("menu")){
            StartSwimmingLessons.startSwimming();
        }
        return input;
    }
    public static int getInputByInt(){
        int input = read.nextInt();
        if (input == 0){
            StartSwimmingLessons.startSwimming();
        }
        return input;
    }
}
