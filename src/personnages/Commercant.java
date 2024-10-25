package personnages;

public class Commercant extends Humain {
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }
    
    public int seFaireExtorquer() {
		int argentPerdu = getArgent();
		setArgent(0);
		parler("J'ai tout perdu ! Le monde est vraiment trop injuste ...");
	    return argentPerdu;
	}
    
    public void recevoir(int argent) {
    	setArgent(getArgent() + argent);
        parler(argent + " sous ! Je te remercie généreux donateur !");
	}
}