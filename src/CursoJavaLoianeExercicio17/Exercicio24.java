package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio24 {

	public static void main(String[] args) {
		String Preco = JOptionPane.showInputDialog(null, "Informe o valor do pão:");
		
		System.out.println("Preço do Pão:"+Preco);

		System.out.println("Panificadora Pão de ontem- Tabelas de Preços:");

		for (int i = 1; i <=50; i++) {
			System.out.println(i+" R$ "+(Double.valueOf(Preco)*i));
			
		}

	}

}
