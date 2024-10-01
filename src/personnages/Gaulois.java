package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int  nb_trophees;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

//	private String prendreParole() {
//
//		return "le gaulios " + nom + ":";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}


//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(effetPotion *( force / 3));
//
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}

	public void boirePotion(int forcePotion) {

		force = forcePotion;
		this.parler(" Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");

	}

	public static void main(String[] args) {
		// tester la classe gaulois
		Romain romain = new Romain("romain", 9);
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("test de la methode parler");
		asterix.frapper(romain);
		asterix.boirePotion(3);

	}
}
