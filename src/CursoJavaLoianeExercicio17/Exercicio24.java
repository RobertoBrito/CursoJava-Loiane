package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio24 {

	public static void main(String[] args) {
		String Preco = JOptionPane.showInputDialog(null, "Informe o valor do p�o:");
		
		System.out.println("Pre�o do P�o:"+Preco);

		System.out.println("Panificadora P�o de ontem- Tabelas de Pre�os:");

		for (int i = 1; i <=50; i++) {
			System.out.println(i+" R$ "+(Double.valueOf(Preco)*i));
			
		}

	}

}
