import java.util.ArrayList;


public class CardTest {
	
	public static void main(String[] args) {
		
		ArrayList<Card> reg = new ArrayList<Card>();
		
		Card c1 = new Employee("Ole" , "Olsen", 1234);
		Card c2 = new Guest("Marit" , "Olsen", 9999);
		reg.add(c1);
		reg.add(c2);
		
		for(int i = 0; i<reg.size(); i++){
			Card card = (Card)reg.get(i);
			System.out.println(card);
			System.out.println("\nTest of card: with code 1234 is " + (card.checkPIN(1234) ? " gyldig" : " ugyldig"));
			System.out.println("\nTest of card: with code 9999 is " + (card.checkPIN(9999) ? " gyldig" : " ugyldig"));
		}
		
	}

}