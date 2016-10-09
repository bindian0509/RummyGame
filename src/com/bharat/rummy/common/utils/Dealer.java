package com.bharat.rummy.common.utils;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
	
	ArrayList<Card> totalCards = new ArrayList<Card>();
	
	Dealer() {
		for (Suits s : Suits.values()) {
		    for (Ranks r : Ranks.values()) {
		         Card c = new Card(s,r);
		         this.totalCards.add(c);
		    }  
		}
		Collections.shuffle(totalCards);
	}

}
