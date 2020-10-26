package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

//calcular horas trabalhada 
public class exercicio08 {
	public static void main(String[] args) {
		
		String valorHora = JOptionPane.showInputDialog("informe o valor da hora trabalhada: ");
		String numeroHora = JOptionPane.showInputDialog("Qual é o numero de horas trabalhada: ");
		
		double salario = Double.valueOf(valorHora) * Double.valueOf(valorHora);
		
		System.out.println("o salario é: "+ salario);
		
	}

}
