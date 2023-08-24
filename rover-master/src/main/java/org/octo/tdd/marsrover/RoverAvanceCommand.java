package org.octo.tdd.marsrover;

public class RoverAvanceCommand implements RoverCommand{
    private Rover rover;

    public RoverAvanceCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        this.rover.avancer();
    }
}
