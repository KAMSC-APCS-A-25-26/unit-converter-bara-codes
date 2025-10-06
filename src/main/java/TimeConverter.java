import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nConvert time to total seconds\n");
            System.out.print("Enter Hours: ");
            int hours = sc.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = sc.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = sc.nextInt();
            int convertedhours = hours * 3600;
            int convertedminutes = minutes * 60;
            int total = convertedminutes + convertedhours + seconds;
            System.out.println("\nTime Conversion:");
            System.out.println("Input: " + hours + " hour, " + minutes + " minute, " + seconds + " second");
            System.out.println("Total: " + total + " second");
            System.out.println("\nCalculation: ");
            System.out.println(hours + " hours x 3600 = " + convertedhours + " second");
            System.out.println(minutes + " minutes x 60 = " + convertedminutes + " second");
            System.out.println(seconds + " second = " + seconds + " second");
            System.out.println("Total: " + total + " second");
            System.out.println("");
            System.out.print("Do you want to convert another time? (y/n): ");
            String choice = sc.next();
            switch (choice) {
                case "y":
                    running = true;
                    break;

                case "n":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
    }
}