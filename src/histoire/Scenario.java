package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler(" Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force "
				+ panoramix.getEffetPotionMin() + " à " + panoramix.getEffetPotionMax() + ".");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonour à tous");
		minus.parler("UN GAU..... GAUGAU....");
		asterix.frapper(minus);

	}

}
