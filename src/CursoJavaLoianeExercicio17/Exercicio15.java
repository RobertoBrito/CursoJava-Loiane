package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog(null, "Informe com o n-ésimo termo da série da fibonacci");
		int primeiro = 1;
		int segundo = 1;
		int proxima;
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3; i <= Integer.valueOf(n) ; i++) {
			
			proxima = primeiro + segundo;
			primeiro=segundo;
			segundo=proxima;
			
			System.out.println(proxima);
		}
		
	}

}
