package cursoJavaLoineExercicio13;
import javax.swing.JOptionPane;

//calcular Temperatuda de F° p C°
public class exercicio09 {

	public static void main(String[] args) {

	String temperatura = JOptionPane.showInputDialog("Informe a Temperatura F°: ");
	
	double tempCelsius = (5*(Double.valueOf(temperatura)-32)/9);
	
	System.out.println("a temperatura F° "+temperatura+ " é igual a "+tempCelsius+"C°");
	}
}
