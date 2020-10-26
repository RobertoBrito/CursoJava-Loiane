package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

public class exercicio12 {
	public static void main(String[] args) {
		String alturapessoa = JOptionPane.showInputDialog("entre com altura da pessoa: ");
		
		double pesopessoa = (72.7*Double.valueOf(alturapessoa))-58;
		System.out.println("o peso da pesso ideal é: "+pesopessoa+ " KGs medido pela altura "+alturapessoa+ " informada");
	}

}
