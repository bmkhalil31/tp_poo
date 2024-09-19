package personnages;

import java.util.Iterator;

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
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	private String prendreParole() {
		
		return"le gaulios "+nom+":";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans la machoire de "+romain.getNom());
		romain.recevoirCoup(force/3);
		
	}

	

	public static void main(String[] args) {
		// tester la classe gaulois 
		Gaulois asterix=new Gaulois("Asterix",8);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("test de la methode parler");
		asterix.frapper();
		
		

	}
}
