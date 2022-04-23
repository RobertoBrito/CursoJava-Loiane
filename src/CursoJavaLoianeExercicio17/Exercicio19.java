package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio19 {

	public static void main(String[] args) {

		String Notas = JOptionPane.showInputDialog(null, "Informe o numeros de notas ");
		
		double soma=0;
		double media;
		//int nota;
		
		for(int i=0; i< Integer.valueOf(Notas);i++) {
			String nota = JOptionPane.showInputDialog(null, "entre com a Nota:");
			
			soma += Double.valueOf(nota);
		}
		media = soma / Double.valueOf(Notas);
		System.out.println("A soma é: "+ soma);
		System.out.println("A media é: "+media);
	}

}
