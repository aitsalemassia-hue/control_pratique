package control_pratique.exercice;

public class Main {
	public static void main(String[] args) {
		// 2 ingenieurs
		Employe Ingenieur1 = new Ingenieur("A-1667", " Ahmed sami", 500, 4);
		Employe Ingenieur2 = new Ingenieur("B-1367", " Nabil Aloui", 350, 2);
		// 2 commerciaux
		Employe Commercial1 = new Commercial("C-1667", "Laila Radi", 300, 0.10);
		Employe Commercial2 = new Commercial("C-15647", "Othman Salem", 400, 0.15);
		// tableau employes
		Employe[] employes = { Ingenieur1, Ingenieur2, Commercial1, Commercial2 };
		// 2 projets
		Projet projet1 = new Projet("e221", "java");

		Projet projet2 = new Projet("2er", "python");

		// definir le superieur d'employe
		Ingenieur2.setSuperieur(Ingenieur1);
		Commercial1.setSuperieur(Ingenieur1);
		Commercial2.setSuperieur(Commercial1);
		// les missions
		Mission mission1 = new Mission(3, Ingenieur1, projet1);
		Mission mission2 = new Mission(2, Ingenieur2, projet1);
		Mission mission3 = new Mission(4, Commercial1, projet2);
		Mission mission4 = new Mission(2, Commercial2, projet2);
		// tableau missions
		Mission[] missions = { mission1, mission2, mission3, mission4 };
		// affichage des employes
		System.out.println("affichage des employes ");
		for (Employe e : employes) {
			e.afficherDetails();
			// System.out.println(e.getSuperieur());
			if (e.getSuperieur() != null) {
				System.out.println(" son superieur est :" + e.getSuperieur().nom);
			}
		}

		// affichage des missions

		System.out.println("affichage des missions ");
		for (Mission m : missions) {
			m.afficherRecapitulatif();
		}

		// montantant total
		double montantTotal = 0;
		for (Mission m : missions) {
			montantTotal += m.calculerMontant();
		}

		System.out.println("le montant total est :" + montantTotal);
		int nbemploye = 0;
		for (Employe e : employes) {
			if (e.getSuperieur() != null) {
				if (e.getSuperieur() == Ingenieur1) {
					nbemploye += 1;
				}
			}
		}

		System.out.println("le nombre d’employés directement supervisés par le premier ingénieur " + nbemploye);

	}
}
