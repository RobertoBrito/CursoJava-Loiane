package CursoJavaLoianeExercicio17;

public class Exercicio04 {
	public static void main(String[] args) {
		
		int popA = 8000;
		int popB=20000;
		int cont=0;
		
		while(popA < popB) {
			popA +=(popA/100)*3;
			popB +=(popB/100)*1.5;
			cont++;
		}
		
	System.out.println("População A: "+popA);
	System.out.println("População B: "+popB);
	System.out.println("qunatidade de Anos: "+cont);
	}

}
