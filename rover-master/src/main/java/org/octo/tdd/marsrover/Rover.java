package org.octo.tdd.marsrover;

import java.util.Objects;

import static org.octo.tdd.marsrover.Direction.*;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void tournerADroite() {
        this.direction = this.direction.regarderADroite();
    }

    public void tournerAGauche() {
        this.direction = this.direction.regarderAGauche();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return x == rover.x && y == rover.y && direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }

    public void avancer() {
        this.x += direction.getDeplacementX();
        this.y += direction.getDeplacementY();
    }
}
