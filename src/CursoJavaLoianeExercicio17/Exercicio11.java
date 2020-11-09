package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		double soma=0;
		
		String numero1 = JOptionPane.showInputDialog(null, "informe o primerio numero");
		String numero2 = JOptionPane.showInputDialog(null, "informe o segundo numero");

		for (int i = Integer.valueOf(numero1); i <= Integer.valueOf(numero2); i++) {
			soma += i;

		}
		System.out.println("soma é "+soma);
	}

}
