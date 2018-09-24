package fr.kb.polymorphisme;

public enum Couleur {
//	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	blanc('B'), bleu ('b'), noir ('n'), rouge ('r'), vert ('v');
	private char couleurAbrev;

    private Couleur(char couleurAbrev) {
            this.couleurAbrev = couleurAbrev;
    }
};
