package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		boolean infoValida=false;
		
		

		do {
			String usuario = JOptionPane.showInputDialog(null, "Informe o usu�rio: ");
			String senha = JOptionPane.showInputDialog(null, "Informe a senha: ");
			
			if(usuario.equalsIgnoreCase(senha)) {
				infoValida = false;
				System.out.println("Senha n�o pode ser igual ao usu�rio, digite novamente: ");
			}else {
				infoValida= true;
				System.out.println("Senha e Usu�rio Valido");
			}

		} while (!infoValida);
	}

}
