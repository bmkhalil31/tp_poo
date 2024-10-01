package personnages;

public class Romain {

	private String nom;
	private int force;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePositive();
	}


	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}


	private String prendreParole() {
		
		return "le romain "+nom+":";
	}
	public void recevoirCoup(int forceCoup) {
		assert forcePositive();
		int forceInitial=force;
		force-=forceCoup;
		if (force>0) {
			parler("Aie");
			
		} else {
			parler("J'abondonne.....");

		}
		assert forceDiminue(forceInitial);
		
	}
	private boolean forceDiminue(int forceInitial) {
		
		return force<forceInitial;
	}


	private boolean forcePositive() {
		return force>=0;
	}
	public static void main(String[] args) {
		Romain romain=new Romain("romain1",6);
		
		System.out.println(romain.prendreParole());
		romain.parler("hi");
		romain.recevoirCoup(2);
		
	}
}
