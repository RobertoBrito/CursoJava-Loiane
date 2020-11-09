package CursoJavaLoianeExercicio17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("informe um numero:");
			int num = scan.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("os pares são: " + pares);
		System.out.println("os impares são: " + impares);
	}

}
