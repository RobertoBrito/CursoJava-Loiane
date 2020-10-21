package aulaeExercicosifElse;

import javax.swing.JOptionPane;

public class Aula15switchCase {
	public static void main(String[] args) {
		String diaSemana = JOptionPane.showInputDialog("informe o dia da semana:");

		if (Integer.valueOf(diaSemana) == 1) {
			System.out.println("Domingo");
		} else if (Integer.valueOf(diaSemana) == 2) {
			System.out.println("segunda-feira");

		} else if (Integer.valueOf(diaSemana) == 3) {
			System.out.println("terça-feira");

		} else if (Integer.valueOf(diaSemana) == 4) {
			System.out.println("quarta-feira");

		} else if (Integer.valueOf(diaSemana) == 5) {
			System.out.println("quinta-feira");

		} else if (Integer.valueOf(diaSemana) == 6) {
			System.out.println("sexta-feira");

		} else if (Integer.valueOf(diaSemana) == 7) {
			System.out.println("sabado-feira");

		} else {
			System.out.println("não é um dia da semana válido ");
		}

		switch (Integer.valueOf(diaSemana)) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;
		default:
			System.out.println("não é um dia da semana válido");
		}

	}
}
