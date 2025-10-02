import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            System.out.println("\n---Temperature Converter Menu---\n1. Convert Fahrenheit to Celsius\n2. Convert Celsius to Fahrenheit\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Fahrenheit: ");
                    double f = sc.nextDouble();
                    double ftoc = f-32 * 5/9;
                    System.out.println("Celsius: " + ftoc);
                    break;

                case 2:
                    System.out.print("Celsius: ");
                    double c = sc.nextDouble();
                    double ctof = c * 9/5 + 32;
                    System.out.println("Fahrenheit: " + ctof);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    running = false;

                default:
                    System.out.println("Invalid input. Please enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or 3 to exit: ");
                    break;
            }
        }
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
    }
}