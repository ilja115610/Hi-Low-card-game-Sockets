package com.playtech.client;

import com.playtech.common.PlayerAction;
import com.playtech.game.protocol.FinishRoundRequest;
import com.playtech.game.protocol.StartRoundRequest;

import java.io.BufferedReader;
import java.io.IOException;

public interface GameClient {
    /**
     * Server notifies client that round is started
     */
    void startRound(StartRoundRequest startRoundRequest);

    /**
     * Server notifies client that round is finished
     */
    void finishRound(FinishRoundRequest finishRoundRequest) throws IOException;

    /**
     * Returns card choice made by user
     * @return PlayerAction cardChoice
     */
    PlayerAction getCardChoice();

    /**
     * Client reads text received from server and prints it
     * @param in Reader, from which text is received
     */
    String readText(BufferedReader in) throws IOException;

    /**
     * Greets user and asks whether he wants to play a game.
     * This method is part of client application in order to reduce unnecessary strain on server
     * as it tells the user what application this is before connecting to server.
     * @return true if user whishes to play, otherwise false
     */
    boolean greetUser();
}
