package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

//programa que recebe receba 05 numeros e informe o maior
public class Exercicio07 {
	public static void main(String[] args) {
		
int numermaior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			String valor = JOptionPane.showInputDialog(null, "Informe um numero: ");
			if(Integer.valueOf(valor) > numermaior) {
				numermaior = Integer.valueOf(valor);
			}
			
		}
		System.out.println("O maior numero digitado foi: "+ numermaior);
	}
}
