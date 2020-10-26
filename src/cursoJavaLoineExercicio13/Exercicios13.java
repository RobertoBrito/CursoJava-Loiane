package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

public class Exercicios13 {
	public static void main(String[] args) {
		
		/* primeiro e segundo e terceiro  exercicio
		 String num = JOptionPane.showInputDialog("escreva o primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("escreva o segundo numero: ");
		double soma= Double.valueOf(num)+Double.valueOf(num2);
		System.out.println("o primeiro numero digitado foi: "+ Double.valueOf(num));
		System.out.println("o segundo numero digitado foi: "+ Double.valueOf(num2));
		System.out.println("a soma dos numeros é: "+soma);
			4° exercicio
		String nota1 = JOptionPane.showInputDialog("Digite a Primeira Nota: ");
		String nota2 = JOptionPane.showInputDialog("Digite a Segunda Nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite a Terceira Nota: ");
		String nota4 = JOptionPane.showInputDialog("Digite a Quarta Nota: ");
		
		double media= (Double.valueOf(nota1) + Double.valueOf(nota2) + Double.valueOf(nota3) + Double.valueOf(nota4)) / 4; 

		System.out.println("A media das Notas é: "+ media);
		*/
		
		//quinto exercicio converter Metros por centrimetros
		
		String metro= JOptionPane.showInputDialog("digite a quantidade de metros: ");
		
		double cm = Double.valueOf(metro)*100;
		System.out.println("a quantidade convertida em cm é: " + cm);
		
	}

}
