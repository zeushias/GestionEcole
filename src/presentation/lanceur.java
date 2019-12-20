package presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import metier.Ecole;
import metier.Etudiant;

public class Lanceur {

	public static void main(String[] args) {
		// deux etudiants
				
		Etudiant etudiant1 = new Etudiant("1", "BA", "Fatima");
		Etudiant etudiant2 = new Etudiant("2", "DANON", "Kodzo");
		
		//inscrire
		etudiant1.inscrire();
		etudiant2.inscrire();
		
		// faire examen
		System.out.println(etudiant1.faireExamen());
		
		//  écoles
		
		Ecole ecole = new Ecole("Ensup", "Guyancourt");
		
		List<Etudiant> listEtudiants = new ArrayList<Etudiant>();
		listEtudiants.add(etudiant1);
		listEtudiants.add(etudiant2);
		
		ecole.listeEtudiants(listEtudiants);
		System.out.println("etudiant inscrit à l'ecole " +ecole.getNomEcole());
		
	}

}
