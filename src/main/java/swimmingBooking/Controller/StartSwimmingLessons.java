package swimmingBooking.Controller;

import swimmingBooking.ExceptionHandling.InputHandling;

public class StartSwimmingLessons {
    public static void startSwimming(){
        System.out.println("Please choose the options from below");
        System.out.println("\t1. Book a Leasson\n" +
                "\t2. Update a Lesson\n" +
                "\t3. Delete a Lesson\n" +
                "\t4. Print Monthly Report\n" +
                "\t5. Sign Out\n" +
                "\t6. Exit");
        int chosenOption = InputHandling.getInputByInt();
        try{
            if(chosenOption<=  1 || chosenOption>=6){
                switch (chosenOption){
                    case 1:
                        System.out.println("Book a Lesson");
                    case 2:
                        System.out.println("Update a Lesson");
                    case 3:
                        System.out.println("Delete a Lesson");
                    case 4:
                        System.out.println("Print a Report");
                    case 5:
                        System.out.println("Sign Out");
                    case 6:
                        System.out.println("Exit a System");
                }
            }else{
                System.out.println("Please choose the option from below");
            }
        }catch (Exception e){
                System.out.println("Please choose the option from below");
        }
    }
}
