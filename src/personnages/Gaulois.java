package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

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

	private String prendreParole() {

		return "le gaulios " + nom + ":";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(effetPotion * force / 3);

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
