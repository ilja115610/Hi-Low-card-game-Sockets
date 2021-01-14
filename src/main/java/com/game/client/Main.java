package com.game.client;

import com.game.common.PlayerAction;
import com.game.game.protocol.FinishRoundRequest;
import com.game.game.protocol.PlayerActionDecision;
import com.game.game.protocol.StartRoundRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Main {

    public static void main(String[] args)  {

        StartRoundRequest srr;
        boolean play;
        GameClientImpl game = new GameClientImpl();

        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 8182);
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            play = game.greetUser();
            while (play) {

                srr = (StartRoundRequest) inputStream.readObject();
                game.startRound(srr);
                PlayerAction cardChoice = game.getCardChoice();
                objectOutputStream.writeObject(cardChoice);
                FinishRoundRequest readRequest = (FinishRoundRequest) inputStream.readObject();
                game.finishRound(readRequest);
                play = game.isPlayagain();
                PlayerActionDecision response = new PlayerActionDecision(play);
                objectOutputStream.writeObject(response);
                if (play) {
                    System.out.println("Lets start the next round!");
                } else
                    break;
            }
        }
                    catch (ClassNotFoundException e) {
                        System.out.println(e.getException().getMessage());
                    }
                        catch (IOException e) {
                        System.out.println(e.getMessage());

        }



    }

}
