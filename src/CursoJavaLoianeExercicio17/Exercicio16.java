package CursoJavaLoianeExercicio17;

public class Exercicio16 {
	public static void main(String[] args) {
		
		int primeiro = 1;
		int segundo = 1;
		int proxima =0 ;
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while (proxima <=500) {
			
			proxima = primeiro + segundo;
			primeiro=segundo;
			segundo=proxima;
			
			System.out.println(proxima);
		}
	}
}
