package com.playtech.game.protocol;

import com.playtech.common.Card;
import com.playtech.common.PlayerAction;

import java.time.LocalDateTime;
import java.util.Random;

public class GameProtocolImpl implements GameProtocol {

    private Deck deck;
    private Card basecard;
    private long roundId;


    public GameProtocolImpl() {
        this.deck = new Deck();
        this.roundId = 1;
    }

    @Override
    public Card provideCard() {
        if (this.deck==null) {
            this.deck = new Deck();
        }
        return deck.provideCard(new Random ());
    }

    @Override
    public StartRoundRequest nextRound() {
        this.basecard = provideCard();
        return new StartRoundRequest(10, System.currentTimeMillis(),roundId++,provideCard());
    }

    @Override
    public boolean checkAction(PlayerAction playerAction) {
        Card controlCard = provideCard();
        if (playerAction==PlayerAction.SNAP&&controlCard.getValue().compareTo(basecard.getValue())==0){
        basecard=controlCard;
        return true;
        }
       else if (playerAction==PlayerAction.HIGHER&&controlCard.getValue().compareTo(basecard.getValue())>0){
        basecard = controlCard;
        return true;
        }
        else if (playerAction==PlayerAction.LOWER&& controlCard.getValue().compareTo(basecard.getValue())<0) {
            basecard = controlCard;
            return true;
        }
        else
            basecard=controlCard;
        return false;
    }
}
