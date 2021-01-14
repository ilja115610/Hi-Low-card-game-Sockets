package com.game.game.protocol;

import java.io.Serializable;

public class PlayerActionDecision implements Serializable {
    private int response;

    public PlayerActionDecision(boolean response) {
        if (response) {
            this.response = 1;
        }
        else this.response = 0;
    }

    public int getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "PlayerActionResponse{" +
                "errorText='" + response + '\'' +
                '}';
    }
}
