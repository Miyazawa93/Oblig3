import java.util.Scanner;

public class TextReverseMain {
	
	private static Scanner input = new Scanner(System.in);
	static int counter = 0;
	
	public static void main(String[] args) {
		System.out.println("Skriv inn en string:");
		String stringInput = input.nextLine();
		reverse(stringInput);
	}
	
	public static void reverse(String text){
		reverse(text, text.length()-1);
	}
	
	public static void reverse(String text, int last){
		if(last >= 0){
			System.out.print(text.charAt(last));
			counter++;
			reverse(text, last-1);	
		}else{
			System.out.println("\nDet er " + counter + " tegn i strengen.");
		}
	}
}
		
