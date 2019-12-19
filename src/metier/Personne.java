package metier;

public class Personne {

	private String numPersonne;
	private String nomPersonne;
	private String prenomPersonne;
		
	public Personne(String numPersonne, String nomPersonne, String prenomPersonne) {
		super();
		this.numPersonne = numPersonne;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
	}
	
	public String getNumPersonne() {
		return numPersonne;
	}
	public void setNumPersonne(String numPersonne) {
		this.numPersonne = numPersonne;
	}
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomPersonne() {
		return prenomPersonne;
	}
	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}
	@Override
	public String toString() {
		return "Personne [numPersonne=" + numPersonne + ", nomPersonne=" + nomPersonne + ", prenomPersonne="
				+ prenomPersonne + "]";
	}

}
