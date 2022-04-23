package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio21 {

	public static void main(String[] args) {
		String NumTurma = JOptionPane.showInputDialog(null, "Entre com a quantidade de Turmas");

		boolean invalido = true;
		int soma = 0;
		String NumAlunos;
		for (int i = 1; i <= Integer.valueOf(NumTurma); i++) {
			invalido = true;
			
			do {

				NumAlunos = JOptionPane.showInputDialog(null, "Informa a quantidade de aluno da turma: " + i);
				if (Integer.valueOf(NumAlunos) <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de Alunos inválidos. Digite novamente");
				}
			} while (invalido);
			soma += Integer.valueOf(NumAlunos);
		}
		double media = soma / Integer.valueOf(NumTurma);
		System.out.println("A media é: " + media);

	}

}
