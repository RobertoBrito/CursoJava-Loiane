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
			System.out.println("informe a popula��o A: ");
			popA= scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Numero da popula��o invalida A, informe numero maior que Zero");

			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("informe a popula��o B: ");
			popB= scan.nextDouble();
			
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Numero da popula��o B invalida , informe numero maior que Zero");

			}
		} while (!valido);
		
		
		do {
			System.out.println("informe a taxa de crescimento da popula��o A: ");
			taxaA= scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("Numero da taxa de crescimento da popula��o A invalida, informe numero maior que Zero");

			}
		} while (!valido);
		
		
		do {
			System.out.println("informe a taxa de crescimento da popula��o B: ");
			taxaB= scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("Numero da taxa de crescimento da popula��o B invalida, informe numero maior que Zero");

			}
		} while (!valido);
		
		
		
		
		
		int cont = 0;

		while (popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("qunatidade de Anos: " + cont);
	}
}
