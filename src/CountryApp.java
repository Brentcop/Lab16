import java.util.Scanner;

public class CountryApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		String cont = "Y";
		
		while(cont.equalsIgnoreCase("Y")) {
		
			System.out.println("What would you like to do:");
			System.out.println("1.See country list 2.Add a country 3.Quit");
			String s = Validator.getString(scan, "Enter menu number: ");
			
			if (s.equals("1")) {
				System.out.println();
				FileMethods.readFromFile("Test/Countries.txt");
				System.out.println();
			} else if (s.equals("2")) {
				System.out.println();
				FileMethods.writeToFile("Test/Countries.txt", Validator.getString(scan, "Add Country: "));
				System.out.println("Country saved.");
				System.out.println();
				
			} else if (s.equals("3")) {
				System.out.println();
				break;
			} else {
				System.out.println();
				System.out.println("User input does not match options.  Please try again!");
				System.out.println();	
		}}
		System.out.println("Goodbye");

	}

}