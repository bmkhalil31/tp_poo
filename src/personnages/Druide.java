package personnages;
import java.util.Random;


public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
	}

	public String getNom() {
		return nom;
	}
	public int getEffetPotionMax() {
		return effetPotionMax;
	}
	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}
	public void preparerPotion() {
		Random random = new Random();
		forcePotion=effetPotionMin+random.nextInt(effetPotionMax-effetPotionMin+1);
		if (forcePotion>7) {
			this.parler("J'ai préparé une super potion de force "+forcePotion);
			
		} else {
              
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+forcePotion);
		}
		
	}
	public void booster(Gaulois gaulois) {
		
		if (gaulois.getNom()=="Obélix") {
			this.parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
			
		} else {
			gaulois.boirePotion(forcePotion);

		}
		
		
	}

	private String prendreParole() {

		return "Le druide " + nom + ":";
	}
	
	public static void main(String[] args) {
		Druide panoramix=new Druide("Panoramix",5,10);
		for (int i = 0; i < 10; i++) {
			panoramix.preparerPotion();
			System.out.println(panoramix.forcePotion);
			
		}
	}

}
