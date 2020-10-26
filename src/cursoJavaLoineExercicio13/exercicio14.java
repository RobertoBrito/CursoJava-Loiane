package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

public class exercicio14 {

	public static void main(String[] args) {
		
		String tamanhoarq = JOptionPane.showInputDialog("informe o tamanho do arquivo: ");
		String velocidadeinternet= JOptionPane.showInputDialog("Informe a velocidade da internet: ");
		
		double tempo = Double.valueOf(tamanhoarq) / Double.valueOf(velocidadeinternet);
		
		System.out.println("o tempo de download é: "+tempo);
		
	}
}
