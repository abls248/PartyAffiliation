import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their party affiliation
        System.out.print("Enter your party affiliation (Democrat, Republican, Independent): ");
        String affiliation = scanner.nextLine().toLowerCase();


        // Determine the response based on the party affiliation
        String response;
        if (affiliation.equals( "democrat" )) {
            response = "Donkey";
        } else if (affiliation.equals(" republican")) {
            response = "Elephant";
        } else if (affiliation.equals ("independent")) {
            response = " Person ";
        } else {
            response = " Other";
        }

        // Display the result
        System.out.println("Your party symbol is: " + response);
    }
}