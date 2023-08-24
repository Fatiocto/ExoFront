package org.octo.tdd.marsrover;

public enum Direction {
    Nord("Ouest", "Est", 0, 1),
    Sud("Est", "Ouest", 0, -1),
    Est("Nord", "Sud", 1, 0),
    Ouest("Sud", "Nord", -1, 0);

    private String droite;
    private String gauche;
    private int deplacementY;
    private int deplacementX;

    Direction(String gauche, String droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    Direction(String gauche, String droite, int deplacementY) {
        this(gauche, droite);
        this.deplacementY = deplacementY;
    }

    Direction(String gauche, String droite, int deplacementX, int deplacementY) {
        this(gauche, droite, deplacementY);
        this.deplacementX = deplacementX;
    }

    public int getDeplacementY() {
        return this.deplacementY;
    }

    public int getDeplacementX() {
        return deplacementX;
    }

    public Direction regarderADroite() {
        return Direction.valueOf(droite);
    }

    public Direction regarderAGauche() {
        return Direction.valueOf(gauche);
    }
}
