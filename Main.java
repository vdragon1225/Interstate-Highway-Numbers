import java.util.Scanner; // import Scanner

public class Main {
   public static void main(String[] args) {
      // Declare Scanner
      Scanner scnr = new Scanner(System.in); 

      // Declare variables
      int highwayNumber;
      int primaryNumber;

      // Set highwayNumber equal to user input
      System.out.print("Enter a highway number: ");
      highwayNumber = scnr.nextInt();
      
      // Determine if the highway number is a primary U.S. interstate highway (between 1-99)
      if ((highwayNumber >= 1) && (highwayNumber <= 99)) {
        // Output the highway number
        System.out.print("I-" + highwayNumber); 

        // Determine if the highway is going north/south if highway number is an odd number
        if (highwayNumber % 2 != 0) {
            System.out.println(" is primary, going north/south.");
        }
        else {
          System.out.println(" is primary, going east/west."); // highway number is even so going east/west
        }
      }
      // Determine if the highway number is an auxiliary highway (100-999)
      // Rightmost two digits of highway number must also be a valid primary highway number
      else if ((highwayNumber >= 100) && (highwayNumber <= 999) && (highwayNumber % 100 != 0)) {
          // Output that it is an auxiliary highway and what primary highway it is serving
          System.out.print("I-" + highwayNumber + " is auxiliary, serving I-" + (highwayNumber % 100));

          // Check if the highway is going north/south by odd number
          if (highwayNumber % 2 != 0) {
            System.out.println(", going north/south.");
          }
          else {
            System.out.println(", going east/west."); // highway number is even so going east/west
          }
      }
      // highway number is not valid
      else {
        System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }

      // Close Scanner
      scnr.close();
   }
}
