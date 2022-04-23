package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Digite o numero");
		System.out.println(Integer.valueOf(num) + " ! =");

		int fatorial = 1;
		for (int i = Integer.valueOf(num); i > 0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
	System.out.println("Resultado "+ fatorial);
	}

}
