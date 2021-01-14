package com.game.game.protocol;


import com.game.common.PlayerAction;
import com.game.common.Card;


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
