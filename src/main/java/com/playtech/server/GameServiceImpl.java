package com.playtech.server;

import com.playtech.common.PlayerAction;
import com.playtech.game.protocol.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServiceImpl  {


    public static void main(String[] args) {

        boolean goOn = true;
       try {
           ServerSocket servsocket = new ServerSocket(8182);
           Socket socket = servsocket.accept();
           System.out.println("Server is running...");

           ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
           ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

           GameProtocol protocol = new GameProtocolImpl();
           while (goOn) {
               StartRoundRequest nextRound = protocol.nextRound();
               out.writeObject(nextRound);

               PlayerAction playerAction = (PlayerAction) input.readObject();
               boolean WinOrLoss = protocol.checkAction(playerAction);
               System.out.println(WinOrLoss);
               FinishRoundRequest finish = new FinishRoundRequest(nextRound.getRoundId(), WinOrLoss);
               out.writeObject(finish);
               PlayerActionDecision decision = (PlayerActionDecision) input.readObject();
               goOn = decision.getResponse() == 1;

           }
       }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
       catch (ClassNotFoundException e) {
           System.out.println(e.getException().getMessage());
       }

    }

}
