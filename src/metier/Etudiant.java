package metier;

public class Etudiant extends Personne{

	private String numEtudiant;
	
	public Etudiant(String nom, String prenom, String numEtudiant) {
		super(nom, prenom);
		this.numEtudiant = numEtudiant;
	}

	public String getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	public String faireExamen() {
		return getNom() + " a fait un examen" ;
	}
	
	public boolean inscrire() {
		return true;
	}

	@Override
	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + "]";
	}
}
