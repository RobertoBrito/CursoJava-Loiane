package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio18 {

	public static void main(String[] args) {

		String Num = JOptionPane.showInputDialog(null, "Informe um numero: ");
		boolean primo = true;

		for (int i = 2; i < Integer.valueOf(Num); i++) {
			if (Integer.valueOf(Num) % i == 0) {
				System.out.println("Não é Primo- divisivel por "+i);
					primo=false;
				// break;
			}
		}
		if (primo) {
			System.out.println("É número Primo");
		}

	}

}
