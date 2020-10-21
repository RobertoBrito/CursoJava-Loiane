import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		String temperatura = JOptionPane.showInputDialog("Informe a Temperatura C°: ");

		double tempFarenhit =  (Double.valueOf(temperatura) * 1.8) + 32;

		System.out.println("a temperatura C° " + temperatura + " é igual a " + tempFarenhit + " F°");
	}
}
