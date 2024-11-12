package personnages;
import java.util.Arrays;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private String[] memoire;
	private int indexMemoire;
	
	public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
        this.memoire = new String[30];
        this.indexMemoire = 0;
    }
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain, boolean afficherMessage) {
		argent += gain;
		if (afficherMessage) {
			parler(argent + " sous ! Je te remercie généreux donateur !");
		}
	}
	
	protected void perdreArgent(int perte, boolean afficherMessage) {
		argent -= perte;
		if (afficherMessage) {
			parler("Je n'ai plus que " + argent + " sous en poche.");
		}
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent +" sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
            argent -= prix;
        } else {
            parler("Je n'ai plus que " + argent +" sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
        }
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
    	direBonjour();
    	autreHumain.direBonjour();
    	this.memoire(autreHumain.nom);
        autreHumain.memoire(this.nom);
    }
	
	private void memoire(String nom) {
        if (indexMemoire >= 30) {
            memoire[0] = nom;
        } else {
            memoire[indexMemoire++] = nom;
        }
    }
	
	public void listerConnaissance() {
		System.out.println("(" + this.nom + ") - Je connais beaucoup de monde dont :");
		for (int i = 0; i < indexMemoire; i++) {
            System.out.print(memoire[i]);
            if (i < indexMemoire - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
	}
}
