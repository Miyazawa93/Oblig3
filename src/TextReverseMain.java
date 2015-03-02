import java.util.Scanner;

public class TextReverseMain {
	
	public static void reverse(String text){
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Skriv inn en string:");
		String stringInput = input.nextLine();
		System.out.println(new StringBuilder(stringInput).reverse().toString());
		
		String[] words = stringInput.split(" ");

		for (String word : words) {
		  System.out.println(word.toLowerCase() + " har lengden: " + word.length());
		}

	}
}
