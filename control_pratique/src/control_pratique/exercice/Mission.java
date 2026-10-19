package control_pratique.exercice;

public class Mission {
	private int nbJours;
	private Employe employe;
	private Projet projet;

	public Mission(int nbJours, Employe employe, Projet projet) {
		super();
		this.nbJours = nbJours;
		this.employe = employe;
		this.projet = projet;
	}

	public double calculerMontant() {
		return employe.calculerCout(nbJours);
	}

	public void afficherRecapitulatif() {

		employe.afficherDetails();
		System.out.println(projet.toString());
		System.out.println("la durée de la mission " + nbJours);
		System.out.println("le montant est :" + employe.calculerCout(nbJours));
	}

}
