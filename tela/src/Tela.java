import java.util.Locale;
import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String name = "Talles Pelegrine";
		
		System.out.println("Hello " + name + " how are you?");
		
		String answer = input.nextLine();
		
		if(answer.contains("and you") || answer.contains("e você")) {
			System.out.println("\nI'm excellent!!! Thank you!\n");
		}
		
		System.out.println("Okay, after these cordial attitudes...\n");
		System.out.println("GO STUDY!");
		System.out.println("  ______"
						 + "\n / ~  ~ \\"
						 + "\n/  0  0  \\"
						 + "\n\\   __   /"
						 + "\n \\______/");
		
		input.close();
	}

}
