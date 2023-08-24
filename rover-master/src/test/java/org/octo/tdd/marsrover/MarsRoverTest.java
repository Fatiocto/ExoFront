package org.octo.tdd.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.octo.tdd.marsrover.Direction.*;

public class MarsRoverTest {
    @Test
    public void Doit_garder_sa_position_et_sa_direction_apres_son_initialisation_avec_x0_y0_direction_Nord() {
        //Given
        int x = 0;
        int y = 0;
        Direction direction = Nord;

        //When
        Rover rover = new Rover(x, y, direction);

        //Then
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals(Nord, rover.getDirection());
    }

    @Test
    public void Doit_garder_sa_position_et_sa_direction_apres_son_initialisation_avec_x1_y1_direction_Sud() {
        //Given
        int x = 1;
        int y = 1;
        Direction direction = Sud;

        //When
        Rover rover = new Rover(x, y, direction);

        //Then
        assertEquals(1, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals(Sud, rover.getDirection());
    }

    @Test
    public void Deux_rovers_ayant_la_meme_position_et_direction_sont_egaux() {
        //Given
        Rover rover1 = new Rover(0, 0, Nord);
        Rover rover2 = new Rover(0, 0, Nord);

        //When
        boolean egalite = rover1.equals(rover2);

        //Then
        assertTrue(egalite);

//        assertTrue(new Rover(0, 0, Nord).equals(new Rover(0, 0, Nord)));
    }

    @Test
    public void Quand_le_rover_est_face_au_nord_s_il_tourne_a_droite_il_sera_face_a_l_est_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Nord);

        //When
        rover.tournerADroite();

        //Then
        assertEquals(new Rover(0, 0, Est), rover);
    }

    @Test
    public void Quand_le_rover_est_face_a_l_est_s_il_tourne_a_droite_il_sera_face_au_sud_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Est);

        //When
        rover.tournerADroite();

        //Then
        assertEquals(new Rover(0, 0, Sud), rover);
    }

    @Test
    public void Quand_le_rover_est_face_au_sud_s_il_tourne_a_droite_il_sera_face_a_l_ouest_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Sud);

        //When
        rover.tournerADroite();

        //Then
        assertEquals(new Rover(0, 0, Ouest), rover);
    }

    @Test
    public void Quand_le_rover_est_face_a_l_ouest_s_il_tourne_a_droite_il_sera_face_au_nord_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Ouest);

        //When
        rover.tournerADroite();

        //Then
        assertEquals(new Rover(0, 0, Nord), rover);
    }

    @Test
    public void Quand_le_rover_est_face_au_nord_s_il_tourne_a_gauche_il_sera_face_a_l_ouest_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Nord);

        //When
        rover.tournerAGauche();

        //Then
        assertEquals(new Rover(0, 0, Ouest), rover);
    }

    @Test
    public void Quand_le_rover_est_face_a_l_est_s_il_tourne_a_gauche_il_sera_face_au_nord_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Est);

        //When
        rover.tournerAGauche();

        //Then
        assertEquals(new Rover(0, 0, Nord), rover);
    }

    @Test
    public void Quand_le_rover_est_face_au_sud_s_il_tourne_a_gauche_il_sera_face_a_l_est_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Sud);

        //When
        rover.tournerAGauche();

        //Then
        assertEquals(new Rover(0, 0, Est), rover);
    }

    @Test
    public void Quand_le_rover_est_face_a_l_ouest_s_il_tourne_a_gauche_il_sera_face_au_sud_sans_changer_de_position() {
        //Given
        Rover rover = new Rover(0, 0, Ouest);

        //When
        rover.tournerAGauche();

        //Then
        assertEquals(new Rover(0, 0, Sud), rover);
    }

    @Test
    public void Quand_le_rover_avance_vers_le_nord_la_coordonnee_y_augmente() {
        //Given
        Rover rover = new Rover(0, 0, Nord);

        //When
        rover.avancer();

        //Then
        assertEquals(new Rover(0,1, Nord), rover);
    }

    @Test
    public void Quand_le_rover_avance_vers_l_est_la_coordonnee_x_augmente() {
        //Given
        Rover rover = new Rover(0, 0, Est);

        //When
        rover.avancer();

        //Then
        assertEquals(new Rover(1,0, Est), rover);
    }

    @Test
    public void Quand_le_rover_avance_vers_le_sud_la_coordonnee_y_decrement() {
        //Given
        Rover rover = new Rover(0, 0, Sud);

        rover.avancer();

        assertEquals(new Rover(0,-1, Sud), rover);
    }

    @Test
    public void Quand_le_rover_avance_vers_l_ouest_la_coordonnee_x_decrement() {
        //Given
        Rover rover = new Rover(0, 0, Ouest);

        //When
        rover.avancer();

        //Then
        assertEquals(new Rover(-1,0, Ouest), rover);
    }

    @Test
    public void Quand_le_rover_avance_vers_le_nord_deux_fois_la_coordonnee_y_incremente_deux_fois() {
        //Given
        Rover rover = new Rover(0, 0, Nord);

        //When
        rover.avancer();
        rover.avancer();

        //Then
        assertEquals(new Rover(0,2, Nord), rover);
    }

    @Test
    public void Quand_le_rover_avance_vers_l_est_deux_fois_la_coordonnee_x_incremente_deux_fois() {
        //Given
        Rover rover = new Rover(0, 0, Est);

        //When
        rover.avancer();
        rover.avancer();

        //Then
        assertEquals(new Rover(2,0, Est), rover);
    }

}
