import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n---Distance Converter Menu---\n1. Convert Miles to Kilometers\n2. Convert Kilometers to Miles\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Miles: ");
                    double miles = sc.nextDouble();
                    double mtok = miles * 1.60935;
                    System.out.println("Kilometers: " + mtok);
                    break;

                case 2:
                    System.out.print("Kilometers: ");
                    double kilo = sc.nextDouble();
                    double ktom = kilo / 1.60935;
                    System.out.println("Miles: " + ktom);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input. Please enter 1 to convert Miles to Kilometers, 2 to convert Kilometers to Miles, or 3 to exit: ");
                    break;
            }
        }
    }
}