package personnages;

public class Village {

	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Chef chef;

	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {

		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		

	}

	public Gaulois trouverHabitant(int ref) {

		return villageois[ref];

	}

	public void afficherVillageois() {
		System.out.println("Dans le Village du chef "+chef.getNom()+" vivent les légendaire gaulois :");
		
		int i;
		for ( i=0;i<nbVillageois;i++) {
			System.out.println("- "+this.trouverHabitant(i).getNom());
			
		}

	}

	public String getNom() {
		return nom;
	}

	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
//		Gaulois gaulois =village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Aterix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix=new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
//		Gaulois gaulois=village.trouverHabitant(1);
//		System.out.println(gaulois);

	}

}
