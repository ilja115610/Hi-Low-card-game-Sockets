package com.playtech.client;

import com.playtech.common.PlayerAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;




public class UserInput {


    private BufferedReader br;
    private int roundTime;
    private String line = "";

    public UserInput(int roundTime) {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.roundTime = roundTime;
    }

    public UserInput() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public boolean goOn() {
        String response = "";
        try {
            response = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return response.equalsIgnoreCase("yes");
    }


    public PlayerAction getChoice() {
        CountDown.running=false;
        int count = roundTime;
        System.out.println("You have " + count + "seconds...");
        TimerTask tt = new CountDown();
        Timer timer = new Timer();
        timer.schedule(tt, 10);
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if(!line.isEmpty()){
            CountDown.running =true;
        }
        while (!line.equals("h") && !line.equals("l") && !line.equals("s")) {
            System.out.println("Wrong input, please enter 'h','l' or 's'");
            try {
                line = br.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (line.equals("h")) {
            return PlayerAction.HIGHER;
        } else if (line.equals("l")) {
            return PlayerAction.LOWER;
        } else
            return PlayerAction.SNAP;
    }
}

    class CountDown extends TimerTask {
        volatile static boolean running=false;

        @Override
        public void run() {
            int count = 10;
            while (!running) {
                System.out.print(count + "\r");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count--;
                if (count < 0) {
                    System.out.println("Time is up, bye bye...");
                    running = true;
                    System.exit(0);
                }
            }
        }
    };





