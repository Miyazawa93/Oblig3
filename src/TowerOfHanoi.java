import java.util.Scanner;


public class TowerOfHanoi {
	static int counter = 0;
	static int counterRecursiveCalls = 0;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall ønskede disker:  ");
		
		int n = input.nextInt();
		
		System.out.println("Flyttingene er:");
		flyttDisker(n, 'A', 'B', 'C');
		System.out.println("\nAntall flytt: " + counter);
		
		System.out.println("\nAntall metodekall er: " + counterRecursiveCalls );
	}

	private static void flyttDisker(int n, char fromTower, char toTower, char auxTower) {
		counter++;
		if(n==1){
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
			counterRecursiveCalls++;
		}else{
				counterRecursiveCalls++;
				flyttDisker(n-1, fromTower, auxTower, toTower);
				System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
				counterRecursiveCalls++;
				flyttDisker(n-1, fromTower, auxTower, toTower);
		}
		
	}

}
