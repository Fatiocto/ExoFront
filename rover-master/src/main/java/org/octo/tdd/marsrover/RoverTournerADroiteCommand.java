package org.octo.tdd.marsrover;

public class RoverTournerADroiteCommand implements RoverCommand{
    private Rover rover;

    public RoverTournerADroiteCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        this.rover.tournerADroite();
    }
}
