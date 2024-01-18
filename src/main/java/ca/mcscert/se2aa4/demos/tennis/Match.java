package ca.mcscert.se2aa4.demos.tennis;

import java.util.Optional;

public class Match {
    public static final String P1_NAME = "P1";
    public static final String P2_NAME = "P2";
    public Match(Integer p1Strength, Integer p2Strength){

    }
    public String play(){
        ScoreSystem scorer = new ScoreSystem();
        while(!scorer.isEnded()){
            String who = decideGameWinner();
            scorer.score(who);
        }
        return scorer.winner().
                orElseThrow(() -> new IllegalArgumentException("No Winner!"));
    }

    private String decideGameWinner(){
        System.out.println("This player wins the game: " + P1_NAME);
        return P1_NAME;
    }

}
