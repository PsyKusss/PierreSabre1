package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;
    
    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0;
    }
    
    public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	@Override
    public void direBonjour() {
        super.direBonjour(); 
        parler("Je fais partie du clan " + clan + ".");
    }

	public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
    	parler(victime.getNom() + " , si tu tiens à la vie donne moi ta bourse !");
    	int argentVictime = victime.getArgent();
    	victime.seFaireExtorquer();
    	int argentTotal = argentVictime + getArgent();
    	setArgent(argentTotal);
    	parler("J'ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + argentTotal + " sous dans ma poche. Hi ! Hi !");
	}
    
    public int perdre() {
    	parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de Warsong.");
        int argentPerdu = getArgent();
        setArgent(0);
        reputation --; 
        return argentPerdu;
    }
    
    public void gagner(int gain) {
    	int argentGagner = getArgent() + gain;
        reputation ++; 
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
}
