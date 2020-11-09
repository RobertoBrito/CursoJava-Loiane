package CursoJavaLoianeExercicio17;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean valido = false;
		double popA ;
		double popB ;
		double taxaA;
		double taxaB;
		
		do {
			System.out.println("informe a população A: ");
			popA= scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Numero da população invalida A, informe numero maior que Zero");

			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("informe a população B: ");
			popB= scan.nextDouble();
			
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Numero da população B invalida , informe numero maior que Zero");

			}
		} while (!valido);
		
		
		do {
			System.out.println("informe a taxa de crescimento da população A: ");
			taxaA= scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("Numero da taxa de crescimento da população A invalida, informe numero maior que Zero");

			}
		} while (!valido);
		
		
		do {
			System.out.println("informe a taxa de crescimento da população B: ");
			taxaB= scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("Numero da taxa de crescimento da população B invalida, informe numero maior que Zero");

			}
		} while (!valido);
		
		
		
		
		
		int cont = 0;

		while (popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("qunatidade de Anos: " + cont);
	}
}
