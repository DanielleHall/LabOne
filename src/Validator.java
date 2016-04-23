import java.util.*;
public class Validator {
	public static int readValidInt() {
		Scanner s = new Scanner (System.in);
		while (!s.hasNextInt()) {
			s.nextLine();
			System.out.print("Please make a valid selection! Enter a number: ");
		}
		int x = s.nextInt();
		s.nextLine();
		return x;
	}
	public static String get_String(String prompt) {
	    String s = "";
	    boolean isValid = false;
	    Scanner sc = new Scanner(System.in);
	    while (!isValid){ // loops until user enters a non-blank line

	    System.out.print(prompt);
	    s = sc.nextLine();
	    if (!s.equals(""))
	    isValid = true;
	}

	    return s;

	}
	       
	public static String getString(String prompt)
    {

            String s = null;
            boolean isValid = false;
            while (!isValid)

       {
            s = get_String(prompt);
            if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)
            isValid = true;
            else
            System.out.println("\nError! You must enter 'y' or 'n'!");
       }

            return s;
     }
}
