package CursoJavaLoianeExercicio17;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		boolean Notavalida =  false;
		
			do {
				String Nota = JOptionPane.showInputDialog(null, "informe a nota : ");
				
				if(Integer.valueOf(Nota) <= 10 &&  Integer.valueOf(Nota) >=0) {
					Notavalida = true;
					System.out.println("Foi digitado a Nota " + Nota);
					
				}else {
					System.out.println("Nota inválida digite novamente: ");
				}
			}while(!Notavalida);
		
		
			
			
			
	}
}
