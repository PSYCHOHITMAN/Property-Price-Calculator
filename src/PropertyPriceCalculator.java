import java.util.InputMismatchException;
import java.util.Scanner;

public class PropertyPriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 2D array to store property prices
        double[][] propertyPrices = new double[3][3];

        // Array of province names for output readability
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        try {

        // Input property prices for each province
        for (int i = 0; i < provinces.length; i++) {
            System.out.printf("Enter property prices for %s (Flat, Townhouse, House):%n", provinces[i]);
            System.out.print("Flat: R ");
            propertyPrices[i][0] = scanner.nextDouble();
            System.out.print("Townhouse: R ");
            propertyPrices[i][1] = scanner.nextDouble();
            System.out.print("House: R ");
            propertyPrices[i][2] = scanner.nextDouble();
            System.out.println(); // Add a new line for better readability
        }

        // Calculate and print total average property price for each province
        for (int i = 0; i < propertyPrices.length; i++) {
            double total = 0;

            // Sum prices for each type of property in the province
            for (int j = 0; j < propertyPrices[i].length; j++) {
                total += propertyPrices[i][j];
            }

            // Calculate average property price for the province
            double averagePrice = total / propertyPrices[i].length;

            // Print the results
            System.out.printf("Total average property price for %s: R %.2f%n", provinces[i], averagePrice);
        }
        }catch(InputMismatchException e){
           System.out.print("try again");     
           scanner.nextLine();
                }

        // Close the scanner
        scanner.close();
    }
}
