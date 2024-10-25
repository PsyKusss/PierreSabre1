package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
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
	
	protected void gagnerArgent(int gain) {
		argent += gain;
		parler("J'ai gagner " + gain + " sous !");
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
		parler("Je n'ai plus que " + argent + " sous en poche.");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent +" sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
            argent -= prix;
        } else {
            parler("Je n'ai plus que " + argent +" sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
        }
	}
}
