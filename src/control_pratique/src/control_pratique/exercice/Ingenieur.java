package control_pratique.exercice;

public class Ingenieur extends Employe {
	private int niveauExpertise;

	
	
	
	
	public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise = niveauExpertise;
	}





	@Override
	public double calculerCout(int nbJours) {
		if(niveauExpertise < 3) return tarifJournalier * nbJours;
		return(tarifJournalier * nbJours) + (100 * nbJours)  ;
	}





	

}
