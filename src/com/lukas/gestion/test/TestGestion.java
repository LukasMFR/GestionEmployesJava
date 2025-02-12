package com.lukas.gestion.test;

import com.lukas.gestion.models.Employe;
import com.lukas.gestion.models.Manager;

public class TestGestion {
	public static void main(String[] args) {
		// Création d'employés
		Employe e1 = new Employe("Alice", 1990, 2500);
		Employe e2 = new Employe("Bob", 1985, 2800);

		// Création d'un manager
		Manager m1 = new Manager("Charlie", 1980, 4000, 1000);

		// Affichage
		System.out.println("=== Liste des employés ===");
		e1.afficher();
		e2.afficher();

		System.out.println("\n=== Manager ===");
		m1.afficher();
	}
}