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
public class Croupier {
    private List<Card>hand;
    
    public Croupier (List<Card>hand) {
        this.hand = hand;
    }
    
    public List<Card> getCards() {
        return hand;
    }
}
