package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Ecole {

	private String nomEcole;
	private String adresseEcole;
	
	
	public Ecole(String nomEcole, String adresseEcole) {
		super();
		this.nomEcole = nomEcole;
		this.adresseEcole = adresseEcole;
	}

	public String getNomEcole() {
		return nomEcole;
	}

	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	public String getAdresseEcole() {
		return adresseEcole;
	}

	public void setAdresseEcole(String adresseEcole) {
		this.adresseEcole = adresseEcole;
	}
	
	public void listeEtudiants(List<Etudiant> listEtudiant) {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		for(Etudiant etudiant : listEtudiant) {
			System.out.println(etudiant);
		}
	}
	public void inscription(HashMap<String, Etudiant> map,Etudiant e){
		map.put(this.nomEcole, e);	
	}

	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresseEcole=" + adresseEcole + "]";
	}
		
	
}
