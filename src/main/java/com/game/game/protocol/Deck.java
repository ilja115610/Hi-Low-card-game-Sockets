package com.game.game.protocol;

import com.game.common.Card;

import java.util.*;

public class Deck {

   private List<Card> deck ;

    public Deck() {
        List<Card> unshuffledDeck = new ArrayList<Card>();
        for (Card card : Card.values()){
            unshuffledDeck.add(card);
        }
        deck = unshuffledDeck;
        Collections.shuffle(deck);
    }

    public void shuffleDeck () {
        Collections.shuffle(deck);
    }




    Card provideCard (Random rand) {
        return deck.remove(rand.nextInt(deck.size()));
    }

}
