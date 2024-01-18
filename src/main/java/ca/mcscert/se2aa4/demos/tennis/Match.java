package ca.mcscert.se2aa4.demos.tennis;

public class Match {
    public static final String P1_NAME = "P1";
    public static final String P2_NAME = "P2";
    public Match(Integer p1Strength, Integer p2Strength){

    }
    public Player play(){
        ScoreSystem scorer = new StupidMVP();
        while(!scorer.isEnded()){
            Player who = decideGameWinner();
            scorer.score(who);
        }
        return scorer.winner().
                orElseThrow(() -> new IllegalArgumentException("No Winner!"));
    }

    private Player decideGameWinner(){
        System.out.println("This player wins the game: " + P1_NAME);
        return new Player(P1_NAME);
    }

}
