package fr.kb.polymorphisme;

public class Creature implements Carte {
	String nom;
	int cout, pointsDegats, pointsVie;
	
	public Creature (int cout, String nom, int pointsDegats, int pointsVie) {
		this.cout = cout;
		this.nom = nom;
		this.pointsDegats = pointsDegats;
		this.pointsVie = pointsVie;
		System.out.println("Une nouvelle créature.");
	}
	
	@Override
	public String afficher() {
		return "Une créature " + nom + " " + pointsDegats + " " + pointsVie;
	}
	
}
