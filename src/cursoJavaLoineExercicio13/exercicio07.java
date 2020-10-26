package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

//calcular area de um quadrado
public class exercicio07 {
	public static void main(String[] args) {
		
		String quadrado = JOptionPane.showInputDialog("Entre com o tamanho do lado do quadrado: ");
		
		
		double area = Math.pow(Double.valueOf(quadrado), 2);
		System.out.println("a area do quadrado é: "+ area);
		System.out.println("O dobro da area do quadrado é :"+(area*2));
	}

}
