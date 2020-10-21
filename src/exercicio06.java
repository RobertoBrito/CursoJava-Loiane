import javax.swing.JOptionPane;

//calcular area de um circulo
public class exercicio06 {
	public static void main(String[] args) {
		
		String raio= JOptionPane.showInputDialog("Digite o circulo a ser calculado: ");
		
		double area= Math.PI * Math.pow(Double.valueOf(raio), 2);
		
		System.out.println("a area é :" + area);
		
		
	}

}
