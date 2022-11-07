package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign == ROCK) {
            return PAPER;
        } else if (handSign == PAPER) {
            return SCISSOR;
        } else if (handSign == SCISSOR) {
            return ROCK;
        }
        return "What did you even put?";
        //return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign == ROCK) {
            return SCISSOR;
        } else if (handSign == SCISSOR) {
            return PAPER;
        } else if (handSign == PAPER) {
            return ROCK;
        }
        return "No really, what are you putting?";

        //return null;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        while (handSignOfPlayer1 == ROCK) {
            if (handSignOfPlayer2 == ROCK) {
                return "This is a tie";
            } else if (handSignOfPlayer2 == SCISSOR) {
                return getWinningMove(SCISSOR);
            } else if (handSignOfPlayer2 == PAPER) {
                return getWinningMove(ROCK);
            }
            while (handSignOfPlayer1 == SCISSOR) {
                if (handSignOfPlayer2 == SCISSOR) {
                    return "This is a tie";
                } else if (handSignOfPlayer2 == PAPER) {
                    return getWinningMove(PAPER);
                } else if (handSignOfPlayer2 == ROCK) {
                    return getWinningMove(SCISSOR);
                }
            }
            while (handSignOfPlayer1 == PAPER) {
                if (handSignOfPlayer2 == PAPER) {
                    return "This is a tie";
                } else if (handSignOfPlayer2 == ROCK) {
                    return getWinningMove(ROCK);
                } else if (handSignOfPlayer2 == SCISSOR) {
                    return getWinningMove(PAPER);
                }
            }


            //this only works in one direction, not both.
        /* if (handSignOfPlayer1 == ROCK && handSignOfPlayer2 == SCISSOR) {
            return getWinningMove(SCISSOR);
        } else if (handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == PAPER) {
            return getWinningMove(PAPER);
        } else if (handSignOfPlayer1 == PAPER && handSignOfPlayer2 == ROCK) {
            return getWinningMove(ROCK);
        }
        return "You're putting something besides rock paper scissor aren't you?"; */


            //return null;

        }
        return getWinningMove(handSignOfPlayer1);
    }
}
