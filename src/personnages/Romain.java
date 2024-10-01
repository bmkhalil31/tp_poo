package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement = 0;
	private String texte;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePositive();
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {

		case 0:
			addEquipement(equipement);
			break;
		case 1:
			if (equipement.equals(equipements[0])) {

				System.out.println("Le soldat " + this.getNom() + " possède déjà un " + equipement);

			} else
				addEquipement(equipement);
			break;
		default:
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");

		}

	}

	private void addEquipement(Equipement equipement) {

		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement);

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {

		return "le romain " + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {

		int forceInitial = force;
		force -= forceCoup;
		assert forcePositive();
		
		if (force > 0) {
			parler("Aie");

		} else {
			parler("J'abondonne.....");

		}
		assert force < forceInitial;

	}
//
//	public Equipement[] recevoirCoup(int forceCoup) {
//		Equipement[] equipementEjecte = null;
//		// précondition
//		assert force > 0;
//		int oldForce = force;
//		forceCoup = calculResistanceEquipement(forceCoup);
//		force -= forceCoup;
//		 if (force > 0) {
//		 parler("Aïe");
//		 } else {
//		 equipementEjecte = ejecterEquipement();
//		 parler("J'abandonne...");
//		 }
////		switch (force) {
////		case 0:
////			parler("Aïe");
////		default:
////			equipementEjecte = ejecterEquipement();
////			parler("J'abandonne...");
////			break;
////		}
//		// post condition la force a diminuée
//		assert force < oldForce;
//		return equipementEjecte;
//	}
//
//	private int calculResistanceEquipement(int forceCoup) {
//		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
//		int resistanceEquipement = 0;
//		if (nbEquipement != 0) {
//			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
//			for (int i = 0; i < nbEquipement;) {
//				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
//					resistanceEquipement += 8;
//				} else {
//					System.out.println("Equipement casque");
//					resistanceEquipement += 5;
//				}
//				
//			}
//			texte = +resistanceEquipement + "!";
//		}
//		parler(texte);
//		forceCoup -= resistanceEquipement;
//		return forceCoup;
//	}
//
//	private Equipement[] ejecterEquipement() {
//		Equipement[] equipementEjecte = new Equipement[nbEquipement];
//		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
//
//		int nbEquipementEjecte = 0;
//		for (int i = 0; i < nbEquipement; i++) {
//			if (equipements[i] == null) {
//				
//			} else {
//				equipementEjecte[nbEquipementEjecte] = equipements[i];
//				nbEquipementEjecte++;
//				equipements[i] = null;
//			}
//		}
//		return equipementEjecte;
//	}
//
//	

	private boolean forcePositive() {
		return force >= 0;
	}

	public static void main(String[] args) {
//		Romain romain=new Romain("romain1",6);
//		
//		System.out.println(romain.prendreParole());
//		romain.parler("hi");
//		romain.recevoirCoup(2);
//		System.out.println(Equipement.BOUCLIER);
//		
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

	}
}
