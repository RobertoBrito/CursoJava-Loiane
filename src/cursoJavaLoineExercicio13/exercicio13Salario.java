package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

public class exercicio13Salario {
	public static void main(String[] args) {

		String valorHora = JOptionPane.showInputDialog("informe o valor da hora trabalhada: ");
		String numeroHora = JOptionPane.showInputDialog("Qual � o numero de horas trabalhada: ");

		double salarioBruto = Double.valueOf(valorHora) * Double.valueOf(numeroHora);
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totaldescontos = inss + sindicato + ir;
		double salarioliquido = salarioBruto - totaldescontos;

		System.out.println("o salarioBruto �: " + salarioBruto);
		System.out.println(" valor do INSS � : " + inss);
		System.out.println("o valor do sindicato � : " + sindicato);
		System.out.println("o valor do IR �: " + ir);
		System.out.println("o valor total dos descontos � : " + totaldescontos);
		System.out.println("O salario liquido �: " + salarioliquido);

	}

}
