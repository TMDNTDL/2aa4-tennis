package ca.mcscert.se2aa4.demos.tennis;

import java.util.Optional;

public interface ScoreSystem {
    void score(Player playerName);

    boolean isEnded();

    Optional<Player> winner();
}
