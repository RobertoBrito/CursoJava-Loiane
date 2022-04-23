package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio22 {

	public static void main(String[] args) {
		double soma=0;

		String NumCd= JOptionPane.showInputDialog(null, "Entre com a quantidade de Cds: ");
		
		for(int i=1;i<= Integer.valueOf(NumCd);i++) {
			
			String preco = JOptionPane.showInputDialog(null, "Informe o valor do cd: "+i);
			soma += Double.valueOf(preco);
		}
		
			double media= soma/ Integer.valueOf(NumCd);
			System.out.println("A media gasta  com cada cd é: "+media);
	}

}
