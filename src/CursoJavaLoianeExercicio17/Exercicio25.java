package CursoJavaLoianeExercicio17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;

		// System.out.println("Lojas Tabajaras:");

		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = scanner.next();

			if (continuarCompra.equalsIgnoreCase("s")) {
				output = "Lojas Tabajaras\n";

				System.out.println("digite a quantidade de produtos da compra");
				qtdProdutos = scanner.nextInt();

				total = 0;

				for (int i = 1; i <= qtdProdutos; i++) {

					System.out.println("Informe o preço do produto: " + i);
					preco = scanner.nextDouble();
					total += preco;
					output += "Produto" + i + ": R$ " + preco + "\n";
				}
				output += "Total: R$ " + total;

				System.out.println("Total: R$ " + total);

				System.out.println("Entre com o valor pago");
				valorPago = scanner.nextDouble();

				output += "Dinheiro: R$ " + valorPago + "\n";

				troco = total - valorPago;

				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				sair = true;
			}

		} while (!sair);

	}

}
