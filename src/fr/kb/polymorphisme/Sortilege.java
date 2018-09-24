package fr.kb.polymorphisme;

public class Sortilege implements Carte{
	int cout;
	String nom, explication;

	public Sortilege(int cout, String nom, String explication) {
		this.cout = cout;
		this.nom = nom;
		this.explication = explication;
		System.out.println("Un sortilège de plus.");
	}
	
	@Override
	public String afficher() {
		 return"Un sortilège " + nom;
	}
}
