package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		double soma = 0;
		double media = 0;

		for (int i = 0; i < 5; i++) {

			String Num = JOptionPane.showInputDialog(null, "Digite um numero : ");
			soma += Double.valueOf(Num);

		}
		media = soma / 5;
System.out.println("a soma dos numero é: "+soma +"  e a media é "+ media);
	}

}
