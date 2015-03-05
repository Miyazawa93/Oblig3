import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CardTest {
	
	public static void main(String[] args) {
		
		ArrayList<Card> reg = new ArrayList<Card>();
		
		Card c1 = new Employee("Ole Olsen", 1234);
		Card c2 = new Employee("Arild Hansen", 5555);
		Card c3 = new Guest("Marit Olsen", 9999);
		Card c4 = new Guest("Lena Bakken", 9999);
		
		reg.add(c1);
		reg.add(c2);
		reg.add(c3);
		reg.add(c4);
		
		
		//reg.sort(null); Fikk ikke denne til aa fungere 
		
		for(int i = 0; i<reg.size(); i++){
			Card card = (Card)reg.get(i);
			System.out.println("");
			System.out.println(card);
			System.out.println("");
			System.out.print("\nTest of card: with code 1234 is " + (card.checkPIN(1234) ? "granted" : "not granted"));
			System.out.print("\nTest of card: with code 5555 is " + (card.checkPIN(1234) ? "granted" : "not granted"));
			System.out.print("\nTest of card: with code 9999 is " + (card.checkPIN(9999) ? "granted" : "not granted"));
			System.out.println("");
		}
		
	}

}