package fr.kb.polymorphisme;

import java.util.ArrayList;

public class Jeu<E> {
	
	static final int nbMaxCartes = 10;
	ArrayList<Carte> jeu = new ArrayList<Carte>(nbMaxCartes);
	int derniereCarteJouee = -1;
	
	public Jeu(int nbCartes) {
		System.out.println("On change de main");
	}
	
	public Carte piocher(Carte carte) {
		jeu.add(carte);
		return carte;
	}
	
	public void afficher() {
		String contenuDuJeu = "";
		for(Carte carte: jeu) {
			contenuDuJeu += carte.afficher() + "\n";
		}
		System.out.println(contenuDuJeu);
	}
	
	public void joue() {
		this.derniereCarteJouee += 1;
		System.out.println("\nJe joue une carte... \nLa carte jouée est :");
		System.out.println(jeu.get(derniereCarteJouee).afficher());
	}
}
