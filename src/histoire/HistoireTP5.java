package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP5 {

	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza ("Yaku le Noir", "Whisky", 30, "Warsong");
		Ronin roro = new Ronin ("Roro", "shochu", 54);
		Commercant kumi = new Commercant("Kumi", 10);
		Commercant chonin = new Commercant("Chonin", 40);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
	}
}
