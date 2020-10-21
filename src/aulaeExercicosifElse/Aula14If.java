package aulaeExercicosifElse;

import javax.swing.JOptionPane;

public class Aula14If {
	public static void main(String[] args) {

		/*
		 * String idade = JOptionPane.showInputDialog("informa a idade do cidadão: ");
		 * 
		 * if (Integer.valueOf(idade) >= 18) {
		 * System.out.println("Cidadão é maior de idade com a idade :"+idade+" anos"); }
		 * else {
		 * System.out.println("cidadão é menor de idade com a idade :"+idade+" anos"); }
		 */

		String preco = JOptionPane.showInputDialog("informe o valor do produto: ");
		// double valorProd = Double.valueOf(preco);
		if (Double.valueOf(preco) <= 10) {
			System.out.println("Preço está barato, pode comprar sem medo");

		} else if (Double.valueOf(preco) > 10 && Double.valueOf(preco) < 15) {
			System.out.println("você pode pedir um desconto");
		} else if (Double.valueOf(preco) >= 15 && Double.valueOf(preco) < 17) {
			System.out.println("precisa pesquisar mais..vai andar mulher");
		} else {
			System.out.println("valor muito caro do produto");
		}

	}

}
