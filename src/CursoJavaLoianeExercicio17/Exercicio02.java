package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		boolean infoValida=false;
		
		

		do {
			String usuario = JOptionPane.showInputDialog(null, "Informe o usuário: ");
			String senha = JOptionPane.showInputDialog(null, "Informe a senha: ");
			
			if(usuario.equalsIgnoreCase(senha)) {
				infoValida = false;
				System.out.println("Senha não pode ser igual ao usuário, digite novamente: ");
			}else {
				infoValida= true;
				System.out.println("Senha e Usuário Valido");
			}

		} while (!infoValida);
	}

}
