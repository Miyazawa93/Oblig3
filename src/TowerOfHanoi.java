import java.util.Scanner;


public class TowerOfHanoi {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn antall ønskede disker");
		int n = input.nextInt();
		
		System.out.println("The moves are:");
		flyttDisker(n, 'A', 'B', 'C');
	}

	private static void flyttDisker(int n, char fromTower, char toTower, char auxTower) {
		if(n==1)
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
		else{
			flyttDisker(n-1, fromTower, auxTower, toTower);
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
			flyttDisker(n-1, fromTower, auxTower, toTower);
		}
		
	}

}
