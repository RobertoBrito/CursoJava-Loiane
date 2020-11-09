package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		String base = JOptionPane.showInputDialog(null, "Informe a base :");
		String potencia = JOptionPane.showInputDialog(null, "informe a potência: ");
		int resultado = Integer.valueOf(base);

		for (int i = 1; i < Integer.valueOf(potencia); i++) {
			resultado *= Integer.valueOf(base);

	
		}
	System.out.println(resultado);
	}

}
