package ca.mcscert.se2aa4.demos.tennis;

public class Player {
    private final String name;

    public Player(String name){
        this.name = name;
    }

    public String toString(){
        return "Player " + name;
    }
}

