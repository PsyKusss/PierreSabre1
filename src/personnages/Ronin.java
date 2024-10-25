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
		beneficiaire.gagnerArgent(argentDonner,true);
	}
    
    public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa !");
			int argentPris = adversaire.perdre();
			setArgent(getArgent() + argentPris);
			honneur ++;
		} else {
			int argentPris = getArgent();
            setArgent(0);
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			honneur --;
            adversaire.gagner(argentPris);
		}
	}
}
