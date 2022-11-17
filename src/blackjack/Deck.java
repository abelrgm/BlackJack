/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.List;

/**
 *
 * @author Abel
 */
public class Deck {
    private List<Card>deck;
    
    public Deck (List<Card>deck) {
        this.deck = deck;
    }
    
    public List<Card> getCards () {
        return deck;
    }
    
    public Card drawCard () {
        Card card = deck.get(0);
        deck.remove(0);
        System.out.println(card.getCard());
        return card;
    }
}
