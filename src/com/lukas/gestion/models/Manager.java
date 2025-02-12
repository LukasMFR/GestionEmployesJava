package com.lukas.gestion.models;

public class Manager extends Employe {
	private double prime;

	public Manager(String nom, int anneeNaissance, double salaire, double prime) {
		super(nom, anneeNaissance, salaire);
		this.prime = prime;
	}

	// Calcul du salaire total avec prime
	public double calculSalaireTotal() {
		return getSalaire() + prime;
	}

	// Affichage spécifique pour le manager
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Prime : " + prime + ", Salaire total : " + calculSalaireTotal());
	}
}