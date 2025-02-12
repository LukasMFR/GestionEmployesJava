package com.lukas.gestion.models;

public class Employe {
	private String nom;
	private int anneeNaissance;
	private double salaire;

	// Constructeur
	public Employe(String nom, int anneeNaissance, double salaire) {
		this.nom = nom;
		this.anneeNaissance = anneeNaissance;
		this.salaire = salaire;
	}

	// Méthode pour calculer l'âge
	public int calculAge(int anneeActuelle) {
		return anneeActuelle - anneeNaissance;
	}

	// Méthode pour afficher les infos
	public void afficher() {
		int anneeActuelle = 2024; // Valeur fixe pour l'exemple
		int age = calculAge(anneeActuelle); // Utilisation de la méthode ici

		System.out.println("Nom : " + nom + ", Année de naissance : " + anneeNaissance + ", Âge : " + age
				+ " ans, Salaire : " + salaire);
	}

	// Getter pour le salaire
	public double getSalaire() {
		return salaire;
	}
}