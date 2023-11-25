import java.util.*;
public class Main {
	public static void main(String args[]) {
		ArrayOfString array_of_string = new ArrayOfString();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Option:\n1. Add String\n2. Concatenate String\n3. Exit");
			int option = scanner.nextInt();
			if(option == 1) {
				System.out.println("Enter String: ");
				String input = scanner.next();
				array_of_string.addString(input);
			}
			else if(option == 2) {
				String output = array_of_string.concatenatedString();
				System.out.println("Concatenated String: "+output);
			}
			else {
				break;
			}
		}
	}
}
