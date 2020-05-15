package com.playtech.client;

import com.playtech.common.Card;
import com.playtech.common.PlayerAction;
import com.playtech.game.protocol.FinishRoundRequest;
import com.playtech.game.protocol.StartRoundRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class GameClientImpl implements GameClient {

    private PlayerAction cardChoice;
    private boolean playagain;

    @Override
    public void startRound(StartRoundRequest startRoundRequest) {
        Card card = startRoundRequest.getBaseCard();
        System.out.println("This is basecard: " + card);
        System.out.println("Predict the next card: h, l, s ");
        UserInput ui = new UserInput(startRoundRequest.getActionRoundDuration());
        cardChoice = ui.getChoice();
    }

    public boolean isPlayagain() {
        return playagain;
    }

    @Override
    public void finishRound(FinishRoundRequest finishRoundRequest) {
    boolean WinOrNot = finishRoundRequest.isWin();
    if (WinOrNot) {
        System.out.println("Congrats! You won!");
    }
    else {
        System.out.println("Sorry, you lose");
    }
        System.out.println("Do you want to play again?");
    UserInput userInp = new UserInput();
    playagain = userInp.goOn();

    }


    @Override
    public PlayerAction getCardChoice() {
        return cardChoice;
    }

    @Override
    public String readText(BufferedReader in) throws IOException {
        return in.readLine();
    }

    @Override
    public boolean greetUser() {
        boolean play = false;
        System.out.println("Hello, do you want to play a game? Yes/No");
        Scanner input = new Scanner(System.in);
        String answer = "";
        answer = input.nextLine();

        play = answer.equalsIgnoreCase("yes");

        return play;
    }
}
