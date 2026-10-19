package control_pratique.exercice;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	private Employe superieur;

	public Employe(String matricule, String nom, double tarifJournalier) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;
	}

	public Employe getSuperieur() {
		return superieur;
	}

	public void afficherDetails() {
		System.out.println(
				"Employe [matricule=" + matricule + "," + " nom=" + nom + ", tarifJournalier=" + tarifJournalier + "]");
	}

}
