package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {

		boolean infoValida = false;

		do {
			String nome = JOptionPane.showInputDialog(null, "informe o seu nome: ");
			if (nome.length() >= 3) {
				infoValida = true;
				System.out.println("o nome é : " + nome);

			} else {
				System.out.println("Nome precisa ser maior que 3 caractere");
			}

		} while (!infoValida);

		infoValida = false;
		do {
			String idade = JOptionPane.showInputDialog(null, "informe a sua idade: ");

			if (Integer.valueOf(idade) >= 0 && Integer.valueOf(idade) <= 150) {
				infoValida = true;
				System.out.println("a idade é : " + idade);
			} else {
				System.out.println("idade precisa ser entre 0 e 150 ");
			}

		} while (!infoValida);

		infoValida = false;
		do {
			String salario = JOptionPane.showInputDialog(null, "informe o seu salário : ");
			if (Double.valueOf(salario) > 0) {
				infoValida = true;
				System.out.println("o salário é : " + salario);
			} else {
				System.out.println("Salário precisa ser maior que 0,00 ");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			String sexo = JOptionPane.showInputDialog(null, "informe o sexo : ");
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
				System.out.println("o sexo é : " + sexo);
			} else {
				System.out.println("Sexo precisa ser preenchido como 'F' ou 'M' ");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			String estadoCivil = JOptionPane.showInputDialog(null, "Informe o seu estado civil : ");
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
				System.out.println("o estado civil é : " + estadoCivil);
			} else {
				System.out.println("Estado civil  precisa ser preenchido como 's' ou 'c' ou 'v' ou 'd' ");
			}
		} while (!infoValida);

	}

}
