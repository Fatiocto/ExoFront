package org.octo.tdd.marsrover;

public class RoverTournerAGaucheCommand implements RoverCommand {
    private Rover rover;

    public RoverTournerAGaucheCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        this.rover.tournerAGauche();
    }
}
