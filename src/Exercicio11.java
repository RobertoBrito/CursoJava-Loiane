import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("informe o primeiro numero inteiro: ");
		String num2 = JOptionPane.showInputDialog("informe o segundo numero inteiro: ");
		String num3 = JOptionPane.showInputDialog("informe o primeiro numero real: ");

		int resultado1 = (Integer.valueOf(num1) * 2) * (Integer.valueOf(num2) / 2);
		double resultado2 = (Integer.valueOf(num1)*3) + Double.valueOf(num3);
		double resultado3 = Math.pow(Double.valueOf(num3), 3);
		
		System.out.println("resultado 1: "+ resultado1);
		System.out.println("resultado 2: "+ resultado2);
		System.out.println("resultado 3: "+ resultado3);

	}
}
