package com.cesi.example;

/**
 * Created by kriyss on 11/05/17.
 */
public class BowlingGame implements Game {

    private int[] pinsDown = new int[21];
    private int roolIndex = 0;

    @Override
    public void roll(int pinsDown) {
        this.pinsDown[roolIndex++] = pinsDown;
    }

    @Override
    public int score() {
        int score = 0;
        int frameIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += sumInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private int strikeBonus(int frameIndex) {
        return pinsDown[frameIndex + 1] + pinsDown[frameIndex + 2];
    }

    private int sumInFrame(int frameIndex) {
        return pinsDown[frameIndex] + pinsDown[frameIndex + 1];
    }

    private int spareBonus(int frameIndex) {
        return pinsDown[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return pinsDown[frameIndex] + pinsDown[frameIndex + 1] == 10;
    }

    private boolean isStrike(int frameIndex) {
        return pinsDown[frameIndex] == 10;
    }
}
