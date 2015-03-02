import java.util.Scanner;

public class TextReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Skriv inn en string:");
		String stringInput = input.nextLine();
		System.out.println(new StringBuilder(stringInput).reverse().toString());

	}
}
