package metier;

public class Etudiant {

	private int numE;
	private String nomE;
	private String prenomE;
	private Ecole ecole;
		
	public Etudiant(int numE, String nomE, String prenomE) {
		this.numE = numE;
		this.nomE = nomE;
		this.prenomE = prenomE;
	}
	
	public int getNumE() {
		return numE;
	}
	public void setNumE(int numE) {
		this.numE = numE;
	}
	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	public String getPrenomE() {
		return prenomE;
	}
	public void setPrenomE(String prenomE) {
		this.prenomE = prenomE;
	}
	
	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	@Override
	public String toString() {
		return "Etudiant [numE=" + numE + ", nomE=" + nomE + ", prenomE=" + prenomE + "]";
	}	
}
