package org.octo.tdd.marsrover;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Rover rover = new Rover(10, 5, Direction.Nord);
        Map<String, RoverCommand> roverCommand = buildRoverCommand(rover);

        RoverNopCommand defaultValue = new RoverNopCommand();
        boolean loop = true;

        while (loop) {
            AfficherRover(rover, System.out);

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if (command.equals("q")) {
                loop = false;
            }

            roverCommand.getOrDefault(command, defaultValue).execute();
        }
    }

    private static Map<String, RoverCommand> buildRoverCommand(Rover rover) {
        HashMap roverCommand = new HashMap();
        roverCommand.put("a", new RoverAvanceCommand(rover));
        roverCommand.put("d", new RoverTournerADroiteCommand(rover));
        roverCommand.put("g", new RoverTournerAGaucheCommand(rover));

        return roverCommand;
    }

    public static void AfficherRover(Rover rover, PrintStream out) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 20; x++) {
                if (rover.getX() == x && rover.getY() == y)
                    out.print("o");
                else
                    out.print(".");
            }
            out.println();
        }
    }
}
