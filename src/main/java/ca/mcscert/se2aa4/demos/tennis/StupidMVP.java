package ca.mcscert.se2aa4.demos.tennis;

import java.util.Optional;

public class StupidMVP implements ScoreSystem {

    private Player winner = null;

    @Override
    public void score(Player playerName){
        this.winner = playerName;
    }
    @Override
    public boolean isEnded(){
        return winner != null;
    }

    @Override
    public Optional<Player> winner(){
        return (isEnded()? Optional.of(winner) : Optional.empty());
    }

}
