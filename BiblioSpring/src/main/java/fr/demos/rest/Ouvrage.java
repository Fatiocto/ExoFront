package fr.demos.rest;

public class Ouvrage {
	
	private String titre;
	private String auteur;
	private int nbExemplaires;
	public Ouvrage() {}

	public Ouvrage(String titre, String auteur, int nbExemplaires) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nbExemplaires = nbExemplaires;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setNbExemplaires(int nbExemplaires) {
		this.nbExemplaires = nbExemplaires;
	}
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public int getNbExemplaires() {
		return nbExemplaires;
	}
	public void decrementeNbExemplaires() {
		if (nbExemplaires > 0) {
			nbExemplaires--;
		}
	}
	public void incrementeNbExemplaires() {
		nbExemplaires++;
	}
	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", auteur=" + auteur + "nb=" + nbExemplaires + "]";
	}
	
}
