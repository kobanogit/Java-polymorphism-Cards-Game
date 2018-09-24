package fr.kb.polymorphisme;

public class Terrain implements Carte {

	Couleur couleur = Couleur.blanc;
	int cout = 0;
	
	public Terrain (char couleur) {
	    switch (couleur) {
	    	case 'B':
	    		this.couleur = Couleur.blanc;
	    		break;	
	    	case 'b':
	    		this.couleur = Couleur.bleu;
	    		break;
	    	case 'n':
	    		this.couleur = Couleur.noir;
	    		break;
	    	case 'r':
	    		this.couleur = Couleur.rouge;
	    		break;
	    	case 'v':
	    		this.couleur = Couleur.vert;
	    		break;
	    }
//	    System.out.println("Carte Terrain couleur " + couleur);
	    System.out.println("Un nouveau terrain.");
    }

	@Override
	public String afficher() {
		return "Un terrain " + couleur;
	}
}
