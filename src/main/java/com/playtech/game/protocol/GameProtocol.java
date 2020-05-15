package com.playtech.game.protocol;


import com.playtech.common.Card;
import com.playtech.common.PlayerAction;


/**
 * This is the game protocol where all game logic will be contained
 */
public interface GameProtocol {

  Card provideCard();

  StartRoundRequest nextRound();

  /**
   * Checks player action and returns whether he is correct or not. New card becomes base card.
   * @param playerAction player prediction of next card
   * @return true if player is correct and false if not
   */
  boolean checkAction(PlayerAction playerAction);
}
