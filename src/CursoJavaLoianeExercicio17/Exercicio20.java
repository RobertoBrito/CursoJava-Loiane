package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio20 {

	public static void main(String[] args) {
	
		String idades = JOptionPane.showInputDialog(null, "Entre com as idades");
		int soma=0;
		
		for (int i = 0; i < Integer.valueOf(idades); i++) {
			String idade = JOptionPane.showInputDialog(null, "informe a idade da pessoa "+(i+1));
			
			soma+= Integer.valueOf(idade);
			
		}
		double media = soma / Integer.valueOf(idades);
		System.out.println("Media de idade: "+media);
		
		if(media>=0 && media <=25) {
			System.out.println("Pessoa Jovem");
		}else if (media>=26 && media <=60){
			System.out.println("Pessoa Adulta");
		} else {
			System.out.println("Pessoa Idosa");
		}
	}

}
