package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1;
    }
    
    public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (getArgent() * 0.1);
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous.");
		beneficiaire.gagnerArgent(argentDonner);
	}
}
