package presentation;

import metier.Ecole;
import metier.Etudiant;

public class Lanceur {

	public static void main(String[] args) {
		// deux étudiants
		
		Etudiant etudiant = new Etudiant("1", "BA", "Fatima");
		Etudiant etudiant2 = new Etudiant("2", "DANON", "Kodzo");
		
		//inscrire
		
		// faire examen
		etudiant.faireExamen();
		
		//  écoles
		
		Ecole ecole = new Ecole("Ensup", "Guyancourt");
		if(!etudiant.inscrire()) {
			ecole.getEtudiants().add(etudiant) ;
			etudiant.setEcole(ecole);
		}
		
		if(!etudiant2.inscrire()) {
			ecole.getEtudiants().add(etudiant2) ;
			etudiant2.setEcole(ecole);
		}
		
		// 
		
		System.out.println(ecole.toString());
		System.out.println(etudiant.toString());
		System.out.println(etudiant2.toString());
	}

}
