package exemplovenda;

import java.math.BigDecimal;

public class ExecutarVenda {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("java POO");
		produto1.setValor(BigDecimal.valueOf(150.00));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo logica de programação");
		produto2.setValor(BigDecimal.valueOf(178.00));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo banco de dados");
		produto3.setValor(BigDecimal.valueOf(200.00));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Modulo algoritimo");
		produto4.setValor(BigDecimal.valueOf(150.00));

		Venda venda = new Venda();
		venda.setData("01102020");
		venda.setDescricao("Compra de curso Java");
		venda.setEnderecovenda("frei damião N°30");
		venda.setNomeCliente("roberto");
		venda.setId(1L);
		// venda.setValor(BigDecimal.valueOf(100.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		venda.getListaProdutos().add(produto4);

		//System.out.println("Descriçao venda " + venda.getDescricao() + " com o total da Venda " + venda.totalVenda());

	System.out.println("valor da variavel Total: "+ venda.getvalorTotal());
	}

}
